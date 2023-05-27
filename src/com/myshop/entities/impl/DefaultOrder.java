package com.myshop.entities.impl;

import java.util.Arrays;

import com.myshop.entities.Order;
import com.myshop.entities.Product;

public class DefaultOrder implements Order {
	
private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	
	private String creditCardNumber;
	private Product[] products;
	private int customerId;


	@Override
	public boolean isCreditCardNumberValid(String creditCardNumber) {
		// TODO Auto-generated method stub
		return creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER && !creditCardNumber.contains(" ")
				&& Long.parseLong(creditCardNumber)>0;
	}

	@Override
	public void setCreditCardNumber(String userInput) {
		if(creditCardNumber == null) {
			return;
		}
		this.creditCardNumber = userInput;
		
	}

	@Override
	public void setProducts(Product[] products) {
		this.products = products;
		
	}

	@Override
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		
	}

	@Override
	public int getCustomerId() {
		// TODO Auto-generated method stub
		return this.customerId;
	}

	@Override
	public String toString() {
		return "[ creditCardNumber=" + creditCardNumber + ", products=" + Arrays.toString(products)
				+ ", customerId=" + customerId + " ]";
	}
	
	

}
