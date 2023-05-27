package com.myshop.menu.impl;

import com.myshop.configs.ApplicationContext;
import com.myshop.menu.Menu;

public class SignOutMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
		context.getMainMenu().start();
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("******************* Sign Out ******************");
		System.out.println("Thank you for stopping by.");
	}

}
