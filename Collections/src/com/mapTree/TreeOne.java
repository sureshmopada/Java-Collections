package com.mapTree;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeOne {
	public static void main(String[] args) {
		
		// generic type hash map - passing key and value
	//	TreeMap <String, Integer> hs = new TreeMap();
		
		// tree map used to print values in alphabetical orber
		TreeMap lhm = new TreeMap();

			// put method used to pass key and value
			lhm.put("Bname", "one");
			lhm.put("Aname1", "two");
			lhm.put("Cname2", "three");
			

		
		Set s = lhm.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();  // converting obj to string
			String str = (String)obj; // key stroes in str
			System.out.println(str+ " " + lhm.get(str));
		}
		
	}

}
