package com.listLinked;

import java.util.*;

public class CollectionsOne {
	public static void main(String[] args) {
		LinkedList<student> ll = new LinkedList<>();
	
	// two lines object creation	
//	student s1 = new student("suresh");
//	ll.add(s1);

	// single line object
		
		ll.add(new student(34));
		ll.add(new student(24));
		
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class student{
	int rollno;
	student (int rollno){
	this.rollno=rollno;
}
	public String toString() {
		return " "+rollno;
	}
}