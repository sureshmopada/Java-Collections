package com.mapHashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapOne {
	public static void main(String[] args) {
		
		// generic type hash map - passing key and value
	//	HashMap <String, Integer> hs = new HashMap();
		
		HashMap hm = new HashMap();
		{
			// put method used to pass key and value
			hm.put("name", "one");
			hm.put("name1", "two");
			hm.put("name2", "three");
			
			// used to remove the entry with key
//			hm.remove("name");
			
		};
		
		System.out.println(hm);
		
		// used to get value with key
		System.out.println(hm.get("name"));
		
		Set s = hm.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();  // converting obj to string
			String str = (String)obj; // key stroes in str
			System.out.println(str+ " " + hm.get(str));
		}
		
	}

}
