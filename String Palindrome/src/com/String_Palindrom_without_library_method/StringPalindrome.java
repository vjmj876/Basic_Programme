package com.String_Palindrom_without_library_method;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a word to check weather it is palindrome or not?");
		
		Scanner sc= new Scanner(System.in);
		String word = sc.next();
		
		char wordArray[] = new char[word.length()];
		char reverseArray[]= new char [word.length()];
		wordArray=word.toCharArray();
		for(int i=0 ; i<wordArray.length ; i++) {
		reverseArray[i]=wordArray[wordArray.length-(i+1)];
		 //reverseArray[0]=wordArray[wordArray.length-(0+1)];
		//reverseArray[1]=wordArray[wordArray.length-(1+1)];
		//reverseArray[2]=wordArray[wordArray.length-(2+1)];
		//reverseArray[3]=wordArray[wordArray.length-(3+1)];
		
		}
		
		
		
		if(Arrays.equals(reverseArray, wordArray)) 
			System.out.println(word +" is Palindrome");
		else
			System.out.println(word +" is not Palindrome");
	}

}
