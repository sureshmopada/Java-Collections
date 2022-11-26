package com.listVector;

import java.util.Vector;



public class VectorOne {
	public static void main(String[] args) {
		
		Vector <String> v = new Vector();
		// can specify initial capacity
		Vector <String> obj = new Vector(30);
		v.add("one");
		v.add("two");
		v.add("three");
		System.out.println(v.capacity()); // o/p shows 10 because vector capacity is by befault 10
		                                 // and vector capacity double every time
		
		// can know the size of array
		System.out.println(v.size());
		System.out.println(obj.capacity());
		
		
		
	}

}
