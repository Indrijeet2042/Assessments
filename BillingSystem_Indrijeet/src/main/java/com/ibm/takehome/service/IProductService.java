package com.ibm.takehome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.dao.IProductDAO;

@Service("iProductService")
public class IProductService implements IProductServiceInterface {
	
	@Autowired
	IProductDAO  dao_ob;



	public void updateDetails(Product product) {
		
		dao_ob.updateDetails(product);
	}

	public int lineTotal(int price, int noOfProducts) {
		
		return price*noOfProducts;
	}

	public Product viewProductDetails(String productCode, int noOfProducts) {
		
		Product product =dao_ob.viewProductDetails(productCode,noOfProducts);
		return product;
	}
		
}
	
