package com.GCD;

import java.util.Scanner;

public class GCD_with_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the two number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(a==b)
			return a;
		if(a%b==0)
		    return b;
		if(b%a==0)
			return a;
		if(a>b)
			return (gcd(a%b,b));
		else
			return (gcd(a,b%a));
		
	}

}
