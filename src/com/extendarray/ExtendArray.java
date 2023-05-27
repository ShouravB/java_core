package com.extendarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtendArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));

	}
	public static int[] generateRandomArray(int initiallength) {
		Random r = new Random();
		int[] arr=new int[initiallength];
		for(int i=0;i<initiallength;i++) {
			arr[i]=r.nextInt(100);
		}
		return arr;
	}
	
	public static int[] extendArray(int[] arr) {
		int[] newArr = new int[2*arr.length];
		for(int i= 0; i < arr.length;i++) {
			newArr[i]=arr[i];
		}
		int i=0;
		for(int j=arr.length;j<newArr.length;j++) {
			newArr[j]=arr[i]*2;
			i++;
			
		}
		
		return newArr;
	}
	
	public static int[] extendArraytwo(int[] arr) {
		int newArrayLenght = arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLenght);
		
		for (int i = arr.length; i < newArrayLenght; i++) {
			resultArray[i] = arr[i - arr.length] * 2;
		}
		
		return resultArray;
	}

}
