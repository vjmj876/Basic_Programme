package com.PrimeNumber;

import java.util.Scanner;

public class Check_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		boolean flag=false;
		System.out.println("Enter the number to check weather it is a prime no or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i = 2 ; i<number ; i++) {
			
			if(number%i==0) {
				flag = true;
				System.out.println(number+" is not Prime number");
				break;
			}
			
		}
		if (number==1||number==2) 
			System.out.println(number+" is  Prime number");
		
			else if (flag==false) {
			System.out.println(number+" is  Prime number");
			}
	}

}
