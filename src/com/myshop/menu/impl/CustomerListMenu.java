package com.myshop.menu.impl;

import com.myshop.configs.ApplicationContext;
import com.myshop.entities.User;
import com.myshop.menu.Menu;
import com.myshop.services.UserManagementService;
import com.myshop.services.imp.DefaultUserManagementService;

public class CustomerListMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		User[] users = userManagementService.getUsers();
		if(users == null || users.length == 0) {
			System.out.println("No Users");
		}else {
			for(User user : users) {
				System.out.println(user);
			}
		}
		
	}

	@Override
	public void printMenuHeader() {
	System.out.println("*********** USERS ***********");
	}

}
