package com.myshop.services;

import com.myshop.entities.Order;

public interface OrderManagementService {
	
	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
