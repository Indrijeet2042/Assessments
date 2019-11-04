package com.ibm.takehome.ui;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.regex.Pattern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.IProductService;

public class Client {
	public static void main(String args[]) throws SQLException,Exception {
		ClassPathXmlApplicationContext contexts = new ClassPathXmlApplicationContext("applicationContext.xml");
		IProductService service = contexts.getBean("iProductService",IProductService.class);
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("Enter your choice:");
			System.out.println("Enter 1 to save product details:");
			System.out.println("Enter 2 to Generate Bill by entering Product code and quantity:");
			System.out.println("Enter 3 to exit:");
			choice = Integer.parseInt(sc.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Product Details:");
				System.out.println("-----------------------");
				String productCode;
				do {
				System.out.println("Enter a valid product Code:");
			    productCode=sc.readLine();
				}
				while(!Pattern.matches("[0-9]{4}", productCode));
				System.out.println("Enter the product Name:");
				String productName = sc.readLine();
				System.out.println("Enter the product Category:");
				String productCategory = sc.readLine();
				System.out.println("Enter the product description:");
				String description=sc.readLine();
				System.out.println("Enter the Product Price:");
				int price=Integer.parseInt(sc.readLine());
				System.out.println("Enter the number of Products:");
				int noOfProducts=Integer.parseInt(sc.readLine());
				int lineTotal= service.lineTotal( price, noOfProducts);
	
				service.updateDetails(new Product(productCode,productName, productCategory,description,price,noOfProducts,lineTotal));
				System.out.println("Product Details has been updated");
				break;
			case 2:
				System.out.println("Enter product Code:");
			    productCode=sc.readLine();
			    System.out.println("Enter number of Products:");
			    noOfProducts=Integer.parseInt(sc.readLine());
				Product product=service.viewProductDetails(productCode,noOfProducts);
				System.out.println("--------------------Product Details:---------------------");
				System.out.println("Product Name: "+product.getProductName());
				System.out.println("Product Category:"+product.getProductCategory());
				System.out.println("Product Description:"+product.getDescription());
				System.out.println("Product Price:"+ product.getPrice());
				System.out.println("Quantity:"+product.getNoOfProducts());
				System.out.println("Line Total:"+product.getLineTotal());
				System.out.println("----------------------------------------------------------");
				break;
				
			case 3:
					System.exit(0);
					break;
			
            default:
            	System.out.println("Enter a correct value");
				
            
			
			}
		} while (choice > 0 && choice < 3);
        contexts.close();
	}
}