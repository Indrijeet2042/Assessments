package com.ibm.takehome.bean;

import org.springframework.stereotype.Service;

@Service
public class Product {
	public Product(){
		
	}
	String productCode;
	String productName;
	String productCategory;
	String description;
	int price;
    //int quantity;
    int noOfProducts;
    int lineTotal;
	
	public Product(String productCode,String productName, String productCategory, String description, int price,
			int noOfProducts,int lineTotal) {
		this.productCode=productCode;
		this.productName = productName;
		this.productCategory = productCategory;
		this.description = description;
		this.price = price;
		//this.quantity = quantity;
		this.noOfProducts=noOfProducts;
		this.lineTotal=lineTotal;
	}
	

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productCategory="
				+ productCategory + ", description=" + description + ", price=" + price + ", noOfProducts="
				+ noOfProducts + ", lineTotal=" + lineTotal + "]";
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public int getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(int lineTotal) {
		this.lineTotal = lineTotal;
	}

	public void setproductCategory(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
