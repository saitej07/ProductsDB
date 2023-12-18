package com.saiteja.ProductDemoDB;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	
	
	List<Product> products = new ArrayList<>();
	
	 ProductDB productDB;
	
	
	//Product p = new Product();
	
	
	
	public ProductService() throws SQLException {
		this.productDB = new ProductDB();
	}
	
	public void addProduct(Product p) 
	{
		products.add(p);
		productDB.save(p);
		
		
		
	}
	
	public List<Product> getAllProduct()
	{
		return productDB.getAll();
	}
	
	public Product getProduct(String name)
	{
		for(Product p : products)
		{
			if(p.getName().equals(name))
			{
				return p;
			}
			
		}
		
		return null;
		
	}


}
