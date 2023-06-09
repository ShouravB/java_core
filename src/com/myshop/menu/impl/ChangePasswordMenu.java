package com.myshop.menu.impl;

import java.util.Scanner;

import com.myshop.configs.ApplicationContext;
import com.myshop.menu.Menu;

public class ChangePasswordMenu implements Menu {
	
	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been successfully changed");
		new MainMenu().start();
	
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE PASSWORD *****");
		System.out.print("Enter new password: ");	
		
	}

}
