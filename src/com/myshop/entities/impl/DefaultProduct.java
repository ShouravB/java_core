package com.myshop.entities.impl;

import com.myshop.entities.Product;

public class DefaultProduct implements Product {
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;

	public DefaultProduct() {
	}
	
	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return this.productName;
	}

	@Override
	public String toString() {
		return "DefaultProduct [id=" + id + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", price=" + price + "]";
	}
	

}
