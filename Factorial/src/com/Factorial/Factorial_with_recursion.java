package com.Factorial;

import java.util.Scanner;

public class Factorial_with_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fac(num));

	}

	private static int fac(int num) {
		// TODO Auto-generated method stub
		if(num>0)
		return num*fac(num-1);
		else
			return 1;
	}

}
