package com.setLinkedHash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashOne {
	public static void main(String[] args) {
		
		// normal LinkedHashSet
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(1); // doesn't allow duplicate values
		
		// generic LinkedHashSet
//		LinkedHashSet<strings> ls = new LinkedHashSet();
		
		// can create generic type iterator
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
