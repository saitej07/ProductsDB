package com.saiteja.ProductDemoDB;


import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		ProductService service = new ProductService();
		
		
//		service.addProduct(new Product(1,"Asus vivobook", "Laptop", 2022));
//		service.addProduct(new Product(2,"Mac Studio","Computer",2022));
//		service.addProduct(new Product(3,"Focusrite Mixer","Audio System",2015));
//		service.addProduct(new Product(4,"Type C","Cable",2024));
//		service.addProduct(new Product(5,"Asus Rog","Laptop",2021));
//		service.addProduct(new Product(6,"Macbook pro","Laptop",2021));
//		service.addProduct(new Product(7,"Macom pad","Writting Pad",2020));
//		service.addProduct(new Product(8,"Apple Keyboard","Keyboard",2022));
//		service.addProduct(new Product(9,"Logitech Keyboard","Keyboard",2024));
//		service.addProduct(new Product(10,"Java Black Book","Black Drawer",2022));
//		service.addProduct(new Product(11,"Logi Mouse","Mouse",2022));
//		service.addProduct(new Product(12,"Apple Mouse","Mouse",2022));
//		service.addProduct(new Product(13,"Lenovo Mouse","Mouse",2022));
//		service.addProduct(new Product(14,"BlackBeast","Computer",2021));
		
		List<Product> products = service.getAllProduct();
		for(Product p : products)
		{
			System.out.println(p);
		}
//		
//		System.out.println("====================================");		
//		Product p = service.getProduct("Apple Keyboard");
//		System.out.println(p);
		
	}


	}


