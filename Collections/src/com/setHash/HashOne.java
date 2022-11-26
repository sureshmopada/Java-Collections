package com.setHash;

import java.util.HashSet;
import java.util.Iterator;

public class HashOne {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("one");  // doesn't allow duplicate values
		
		//using iterator
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
