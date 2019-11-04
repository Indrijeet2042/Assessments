package com.ibm.takehome.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.takehome.bean.Product;

@Repository("dao_ob")
public class IProductDAO implements IProductDAOInterface {
	

	
    JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void createConnectionThroughJDBCTemplate() throws SQLException {

		                  //dataSource.getConnection() is used to Get the Connection
		Connection dbCon = dataSource.getConnection();
	}
	
	public void updateDetails(Product product) {
		// TODO Auto-generated method stub
		String qry="insert into module2table(productCode,productName,productCategory,description,price,noOfProducts,lineTotal) values(?,?,?,?,?,?,?)";
		 jdbcTemplate.update(qry,new Object[] {
				 product.getProductCode(),
				 product.getProductName(),
				 product.getProductCategory(),
				 product.getDescription(),
				 product.getPrice(),
				 product.getNoOfProducts(),
				 product.getLineTotal()
		 });
		
	}
	@Override
	public Product viewProductDetails(String productCode, int noOfProducts) {
		// TODO Auto-generated method stub
		String qry="select * from module2table where productCode=? and noOfProducts=?";
		return jdbcTemplate.queryForObject(qry, new Object[] {productCode,noOfProducts}, new UserMapper());
	}
	
	class UserMapper implements RowMapper<Product>{

		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			//product.setProductCode(rs.getString("productCode"));
			product.setProductName(rs.getString("productName"));
			product.setProductCategory(rs.getString("ProductCategory"));
			product.setDescription(rs.getString("description"));
			product.setPrice(rs.getInt("Price"));
			product.setNoOfProducts(rs.getInt("noOfProducts"));
			product.setLineTotal(rs.getInt("lineTotal"));
			return product;
					}	
		
	}
	
}


