package com.controlandloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ControlAndLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
	    String input=sc.nextLine();
	    
	    int[] intArray=convertStringArrayToIntArray(input.split("\\s"));
	    int maxInt=findMaxIntInArray(intArray);
	    
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}
	
	private static int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] intArray= new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++) {
			intArray[i]=Integer.valueOf(stringArray[i]);
		}
		return intArray;
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int maxInt=intArray[0];
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]>maxInt) {
				maxInt=intArray[i];
			}
		}
		return maxInt;
		
	
		
	}
}
