package com.Fibonacci;

import java.util.Scanner;

public class Fibonaaci_without_Reursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 , b=1, c;
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		
		
		for(int i = 1 ; i<=number; i++) {
		
			if(i==1)
				System.out.print(1);
			else {
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
			}
		
		}
		
		

	}

}
