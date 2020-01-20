package com.String_Palindrom_without_library_method;

import java.util.Scanner;

public class Number_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b ,c=0 ;
	
		System.out.println("Enter the number to check weather it is a Pelindrome or not?");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		 int d=number;
		while(number>0) {
			
		b=number%a;
		number=number/a;
		c = c*a + b;
		
		}
		if(d==c) {
			System.out.println(d +" is Palindrome");
		}
		else {System.out.println(d + " in not a Palindrome");}
		
	}
    
}
