package com.saiteja.ProductDemoDB;

public class Product {
	private int id;
	private String name;
	private String type;
	private int warranty;
	
	public Product() {
		
	}

	public Product(int id,String name, String type, int warranty) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.warranty = warranty;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", warranty=" + warranty + "]";
	}

	

}
