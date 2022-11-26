package com.staticMethods;

import java.util.ArrayList;
import java.util.Collections;

public class StaticMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(6);
		al.add(5);
		al.add(4);
		
		System.out.println(al);
		
		// to sort
//		Collections.sort(al);		
//		System.out.println(al);
		
		// to reverse
//		Collections.reverse(al);		
//		System.out.println(al);
		
		
		// to swap
		Collections.swap(al,3,5);		
		System.out.println(al);
		
		// prints minimum value
		System.out.println(Collections.min(al));
		
		// prints maximum value
		System.out.println(Collections.max(al));
		
		
	}

}
