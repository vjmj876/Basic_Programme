package com.GCD;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the two number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=1;
		for(int i=1 ; i<=a ; i++) {
			if(a%i==0) {
				for(int j=1 ; j<=b ; j++) {
					if(b%i==0&&i==j) {c=i;}
						
				}
			}
				
		}
		System.out.println(c);
		
		
	}

}
