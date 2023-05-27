package com.myshop.menu.impl;

import java.util.Arrays;
import java.util.Scanner;

import com.myshop.Main;
import com.myshop.configs.ApplicationContext;
import com.myshop.entities.Cart;
import com.myshop.entities.Product;
import com.myshop.menu.Menu;
import com.myshop.services.ProductManagementService;
import com.myshop.services.imp.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {
	
	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;
	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}
	

	@Override
	public void start() {
		Menu menuToNavigate = null;
		while(true) {
			printMenuHeader();
			printProductToConsole();
			
			String userInput = readUserInput();
			if(context.getLoggedInUser() == null) {
				System.out.println("You are not signed in. Please Sign in First.");
				new MainMenu().start();
				break;
			}
			
			if(userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
				menuToNavigate = new MainMenu();
				break;
			}
			
			if(userInput.equalsIgnoreCase(CHECKOUT_COMMAND)) {
				Cart sessionCart = context.getSessionCart();
				if(sessionCart == null || sessionCart.isEmpty()) {
					System.out.println("Sorry your cart is empty");
					
				}else {
					menuToNavigate=new CheckOutMenu();
					break;
				}
			}else {
				Product productToAddToCart = fetchProduct(userInput);
				
				if(productToAddToCart == null) {
				System.out.println("Enter Product id to add to cart or type checkout to proceed or menu to return to main menu");
				continue;
				}
				
				processAddToCart(productToAddToCart);
			}
			
			
		}
		
		menuToNavigate.start();
		
	}
	
	private void processAddToCart(Product product) {
		context.getSessionCart().addProduct(product);
		System.out.printf("Product %s has been added to your cart. "
				+ "If you want to add a new product - enter the product id. "
				+ "If you want to proceed with checkout - enter word "
				+ "'checkout' to console %n", product.getProductName());
	}

	@Override
	public void printMenuHeader() {
		System.out.println("********************************** PRODUCT CATALOG *******************************");
		System.out.println("Enter product id to add it to the cart or 'menu' if you want to navigate back to the main menu");		
	
		
	}
	
	private Product fetchProduct(String userInput) {
		
		int productIdToAddToCart = Integer.parseInt(userInput);
		Product productToAddToCart = productManagementService.getProductById(productIdToAddToCart);
		return productToAddToCart;
	}
	
	private void printProductToConsole() {
		Product[] products = productManagementService.getProducts();
		for(Product product : products) {
			System.out.println(product);
		}
	}
	
	private String readUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Product ID to add to cart or enter 'checkout' to proceed with checkout:");
		String userInput = sc.nextLine();
		return userInput;
	}
	
	

}
