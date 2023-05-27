package com.java.bhattarai.mathlibrary;

import java.math.*;
import java.util.Scanner;


public class MathDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(Math.sqrt(3));
//		System.out.println(5 / 0.0);		// Infinity
//		System.out.println(-5 / 0.0);		// -Infinity
		
//		System.out.println(Math.random());						// between 0.0 and 1.0
//		System.out.println((int)(Math.random() * 10)); 		// between 0 and 100 
//		System.out.println((int)(Math.random() * 100) + 100);
		
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
//		
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter new name: ");
		String word=scanner.nextLine();
		
		System.out.print("enter age: ");
		int age=scanner.nextInt();
		
		System.out.println("hello "+word+". You are "+age+ "vyears old.");
		
		scanner.close();
		

	}

}
