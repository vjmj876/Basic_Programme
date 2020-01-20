package com.Permutation;

public class Permutation_with_recursion {

	 static int count=1 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABC";
		char s[]=str.toCharArray();
		int l = 0;
		int r = s.length;
		Permutation_with_recursion pwr =new Permutation_with_recursion();
		pwr.permutation( s , l , r-1);
		
	}
	public  void permutation(char[] s, int l , int r) {
			
			if(l==r) {
				int Sr_no=count++;
				System.out.print(Sr_no+": ");
				System.out.println( s);
			}
			else {
				for(int i=l; i<=r; i++) {
					
 				swap(s ,(s[0+l]),(s[0+i]));
 				
			permutation(s,l+1,r);
			swap(s ,(s[0+l]),(s[0+i]));
				}
			}
		}
	public  void swap(char s[], char x , char y ) {
			
			char temp;
			temp = x;
			x=y;
			y=temp;
			
		}

}
