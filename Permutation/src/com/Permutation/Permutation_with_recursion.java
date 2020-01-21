package com.Permutation;

import java.util.Scanner;

public class Permutation_with_recursion {
	static int count = 1;
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	} 
	
	private static void permutations(char[] ch, int currentIndex)
	{
		
		if (currentIndex == ch.length - 1) {
			
			System.out.println(count+" "+String.valueOf(ch));
			count++;
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		permutations(s.toCharArray(), 0);
		a
	}

}
