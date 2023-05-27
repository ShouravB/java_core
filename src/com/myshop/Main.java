package com.myshop;

import com.myshop.menu.Menu;
import com.myshop.menu.impl.MainMenu;

public class Main {
	
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu menu = new MainMenu();
		menu.start();
	
	
	}

}
