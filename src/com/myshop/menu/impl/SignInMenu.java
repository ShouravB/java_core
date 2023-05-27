package com.myshop.menu.impl;

import java.util.Scanner;

import com.myshop.configs.ApplicationContext;
import com.myshop.entities.User;
import com.myshop.menu.Menu;
import com.myshop.services.UserManagementService;
import com.myshop.services.imp.DefaultUserManagementService;

public class SignInMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter your email: ");
		String userEmail = sc.next();

		System.out.print("Please, enter your password: ");
		String userPassword = sc.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if(user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad you are back %s %s", user.getFirstName(), user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		}else {
			System.out.println("You are not registered");
		}
		
		context.getMainMenu().start();

	}

	@Override
	public void printMenuHeader() {
		System.out.println("******************* SIGN IN *************************");
		
	}

}
