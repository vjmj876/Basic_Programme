package com.Fibonacci;

import java.util.Scanner;

public class Fibonacci_with_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt() ;
		System.out.print("1");
		fib(number);

	}

	static int a = 0;
	static int b = 1;
	static int c;
	private static void fib(int number) {
		// TODO Auto-generated method stub
		
		 {
		c=a+b;
		System.out.print(" "+c+" ");
		a=b;
		b=c;
		if(number>2)
		fib(number-1);
		}
		
	}

}
