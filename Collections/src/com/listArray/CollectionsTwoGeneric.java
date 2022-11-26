package com.listArray;
import java.util.*;

public class CollectionsTwoGeneric {
public static void main(String[] args) {

// Generic type 
	List<String> al = new ArrayList<>();
	al.add("Suresh");
	al.add("Mepada");
	al.add("java");
	//al.add(2022);   used when first sop (indicates it takes different values)
	al.add("javaScript");
	//System.out.println(al);

	// using for loop in genrics
//	for (String s:al) {
//		System.out.println(s);
	
	// using size & get methods 
	for (int i=0; i<al.size(); i++) {
		System.out.println(al.get(i));
	}
	
	}
}
