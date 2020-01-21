package com.Factorial;

import java.util.Scanner;

public class Factorial_without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,c = 1;
		while( num!=0) {
			c=c*num;
			num--;
		}
		System.out.println(c);
	}

}
