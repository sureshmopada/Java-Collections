package com.listArray;
import java.util.*;

public class CollectionsFiveAddingElements {
public static void main(String[] args) {

	List<String> all1 = new ArrayList<>();
	all1.add("Suresh");
	all1.add("Mepada");
	all1.add("java");
	all1.add("javaScript");
	//adding element at index postion 2
	all1.add(2,"programs");
	
	List<String> all2 = new ArrayList<>();
	
	all2.add("one");
	all2.add("two");
	// clear method
		//all2.clear();  // clears one and two in all2 method( based on it's place)
	all2.add("three");
	all2.add("four");
	// addAll method
	all2.addAll(1,all1);
	all2.add(5,"five");
	
	
	for (String s:all1) {
	System.out.println(s);
	}
	
	for (String s2:all2) {
		System.out.println(s2);
		}
//	Iterator<String> itr = all1.iterator();
//	all1.forEach(a ->{
//		System.out.println(a);
//});
	
	//equlas method (compares method list one and two method values exact values, order also same- boolean output)
	System.out.println(all1.equals(all2));
	
	//isempty method (boolean output)
	System.out.println(all1.isEmpty());
	//lastIndexof method (gives index method list position number- if we have two java values it gives two index numbers in two run times)
	System.out.println(all1.lastIndexOf("java"));
	
	// contains method (to check element in list - boolean value)
	System.out.println(all1.contains("python"));
	
	//indexOf (this method gives postion of element in list )
	System.out.println(all1.indexOf("python"));
	
	//remove
    System.out.println(all2.remove("two"));
}
}
