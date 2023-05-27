package com.java.bhattarai.arrays;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {

		int[] arr;
		int arr2[];
		arr = new int[10];
//		System.out.println(arr.length);
//		System.out.println(arr[0]);

		double[] arr3 = new double[10];
//		System.out.println(arr3[0]);

		boolean[] arr4 = new boolean[10];
//		System.out.println(arr4[0]);

//		System.out.println(arr4[10]);

		int[] arrayOfFive = { 3, 2, 1 };

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

//		System.out.println(matrix[0][2]);

		int[][] matrix2 = new int[10][10];
//		System.out.println(matrix2[0]);

		System.out.println(java.util.Arrays.toString(arrayOfFive));
		Arrays.sort(arrayOfFive);
		System.out.println(Arrays.toString(arrayOfFive));
		// TODO Auto-generated method stub

	}

}
