package com.swap;

public class Swapping_without_third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10 , b=20;
		
		System.out.println(a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);

	}

}
