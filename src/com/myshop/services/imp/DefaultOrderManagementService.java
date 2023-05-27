package com.myshop.services.imp;

import java.util.Arrays;

import com.myshop.entities.Order;
import com.myshop.services.OrderManagementService;

public class DefaultOrderManagementService implements OrderManagementService {
	
	private static final int DEFAULT_ORDER_CAPACITY = 10;

	private static DefaultOrderManagementService instance;
	private int lastIndex;
	private Order[] orders;

	{
		orders = new Order[DEFAULT_ORDER_CAPACITY];
	}
	
	public static OrderManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}


	@Override
	public void addOrder(Order order) {
		if(order == null) {
			return;
		}
		
		if(orders.length <= lastIndex) {
			orders= Arrays.copyOf(orders, orders.length << 1);
		}

		orders[lastIndex++] = order;
	}

	@Override
	public Order[] getOrdersByUserId(int userId) {
		int amountOfUserOrder = 0;
		for(Order order : orders) {
			if(order != null && order.getCustomerId() == userId) {
				amountOfUserOrder++;
			}
		}
		
		Order[] userOrder = new Order[amountOfUserOrder];
		int index = 0;
		for(Order order : orders) {
			if(order != null && order.getCustomerId() == userId) {
				userOrder[index++] = order;
			}
		}
		
		return userOrder;
	}

	@Override
	public Order[] getOrders() {
		int nonNullOrdersAmount = 0;
		for (Order order : orders) {
			if (order != null) {
				nonNullOrdersAmount++;
			}
		}
		
		Order[] nonNullOrders = new Order[nonNullOrdersAmount];
		
		int index = 0;
		for (Order order : orders) {
			if (order != null) {
				nonNullOrders[index++] = order;
			}
		}
		
		return nonNullOrders;
	}
	
	void clearServiceState() {
		lastIndex=0;
		orders = new Order[DEFAULT_ORDER_CAPACITY];
	}

}
