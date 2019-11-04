package com.ibm.takehome.dao;

import com.ibm.takehome.bean.Product;

public interface IProductDAOInterface {
		public Product viewProductDetails(String productCode, int noOfProducts);
}
