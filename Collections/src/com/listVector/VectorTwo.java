package com.listVector;

import java.util.Vector;

public class VectorTwo {
	public static void main(String[] args) {
		
		// actually capacity is 10, but getting 3 by speciifng in value
		Vector <String> v = new Vector(3);
		
		v.add("one");
		v.add("two");
		v.add("three");
		System.out.println(v.capacity());
	}
	
}