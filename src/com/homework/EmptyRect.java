package com.homework;

import java.util.Arrays;
import java.util.Scanner;

public class EmptyRect {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter a sentence: ");
		String sentence=sc.nextLine();
		System.out.println();
		System.out.print("enter minimum word length: ");
		int minLength=sc.nextInt();
		String[] words=sentence.split("\\s");
		//String[] filtered=Arrays.stream(words).filter(s->s.length()>=minLength.toArray(String[]::new);
		System.out.println(Arrays.toString(filterStream(words,minLength)));
		
		
	}
	public static String[] getDesiredArray(String[] words, int minLength) {
		
		String[] finalArray=new String[words.length];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=minLength) {
				finalArray[i]=words[i];
			}
		}
		return finalArray;
	}
	
	public static String[] filterStream(String[] words, int minLength) {
		return Arrays.stream(words)
					.filter(s->s.length()>=minLength)
					.toArray(String[]::new);
	}

}
