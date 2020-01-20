package comArrayList;


import java.util.Enumeration;
import java.util.LinkedList;

public class arrayFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		
		
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(8);
		a1.add(9);
		a1.add(10);
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(6,7);
		a1.add(0,0);
		
		System.out.println(a1.size());
		
		
		Integer array[]=new Integer[a1.size()];
		
		array = a1.toArray(array);
		
		for (Integer x : array) {
		System.out.print(x+", ");
		
		}
		
		System.out.println("");
		
		
		
			System.out.print(a1.getFirst());
			
			Integer e = a1.element();	
			
			

	}
	
	

}
