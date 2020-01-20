package com.String_Palindrom_without_library_method;

import java.util.Scanner;

public class StringPalindrome_UsingRecursion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		if(ispallindrome(word)) 
			System.out.println(word +" is Palindrome");
		else
			System.out.println(word +" is not Palindrome");

	}

	private static boolean ispallindrome(String word) {
		// TODO Auto-generated method stub
		if(word.length()==0||word.length()==1)
			return true;
		if(word.charAt(0)==word.charAt(word.length()-1)) {
			return ispallindrome(word.substring(1, word.length()-1));
		}
		return false;
	}

	
}
