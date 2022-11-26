package com.mapLinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashOne {
	public static void main(String[] args) {
		
		// generic type hash map - passing key and value
	//	HashMap <String, Integer> hs = new HashMap();
		
		LinkedHashMap lhm = new LinkedHashMap();

			// put method used to pass key and value
			lhm.put("name", "one");
			lhm.put("name1", "two");
			lhm.put("name2", "three");
			

		
		Set s = lhm.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();  // converting obj to string
			String str = (String)obj; // key stroes in str
			System.out.println(str+ " " + lhm.get(str));
		}
		
	}

}
