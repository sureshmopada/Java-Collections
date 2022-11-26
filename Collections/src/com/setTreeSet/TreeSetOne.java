package com.setTreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetOne {
	public static void main(String[] args) {
		
		// tree set prints values in ascending order
		// normal TreeSet
		TreeSet ls = new TreeSet();
		ls.add(10);
		ls.add(200);
		ls.add(3);
		ls.add(40);
		ls.add(5);
		ls.add(10); // doesn't allow duplicate values
		
		// generic TreeSet
//		TreeSet<strings> ls = new TreeSet();
		
		// can create generic type iterator
		Iterator it = ls.iterator();
		
		// can print values in descending order also
		
//		Iterator it = ls.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
						
		}
		
		System.out.println("**************first******************");
		
		// prints starting or lower value
		System.out.println(ls.first());
		
		System.out.println("*************last*******************");
		
		// prints ending or highest value
		System.out.println(ls.last());
		
		System.out.println("**************headset******************");
		// to print less values below 10 
		TreeSet ts1 = (TreeSet) ls.headSet(10);
		System.out.println(ts1);
		
		
		System.out.println("**************tailset******************");
		// to print greater values above 10 
		TreeSet ts2 = (TreeSet) ls.tailSet(10);
		System.out.println(ts2);
		
		
		System.out.println("*************subset*******************");
		// to print betweem values
		TreeSet ts3 = (TreeSet) ls.subSet(3,10);
		System.out.println(ts3);
		
		// not only for int values, for strings also it prints in alphabetical order
		System.out.println("*************for strings also it prints in alphabetical order*******************");
		
		
	}
}
