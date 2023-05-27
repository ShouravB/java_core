package com.myshop.menu.impl;

import com.myshop.configs.ApplicationContext;
import com.myshop.entities.Order;
import com.myshop.menu.Menu;
import com.myshop.services.OrderManagementService;
import com.myshop.services.imp.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}
	@Override
	public void start() {
		printMenuHeader();
		if(context.getLoggedInUser() == null) {
			System.out.println("Please Log in or Create new Account");
			new MainMenu().start();
			return;
		}else {
			printOrdersToConsole();
		}
		
		new MainMenu().start();
		
	}

	private void printOrdersToConsole(){
		Order[] ordersOfLoggedUser = orderManagementService.getOrdersByUserId(context.getLoggedInUser().getId());
		if(ordersOfLoggedUser == null || ordersOfLoggedUser.length == 0) {
			System.out.println("Nothing in the cart to display");
		}else{
			for (Order order : ordersOfLoggedUser) {
				System.out.println(order);
			}
		}
	}
	
	@Override
	public void printMenuHeader() {
		System.out.println("***** MY ORDERS *****");	
		
	}

}
