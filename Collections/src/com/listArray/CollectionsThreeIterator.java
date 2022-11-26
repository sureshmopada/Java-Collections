package com.listArray;
import java.util.*;

public class CollectionsThreeIterator {
public static void main(String[] args) {

	List<String> al = new ArrayList<>();
	al.add("Suresh");
	al.add("Mepada");
	al.add("java");
	al.add("javaScript");

	//List iterator method
	ListIterator<String> itr = al.listIterator();
	System.out.println("in forward direcion");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("in reverse direcion");
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
}
	}
}