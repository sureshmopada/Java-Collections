package com.listArray;

import java.util.*;

class student {
	int rollno;
	String name;
	String address;
	
	student(int rollno, String name, String address){
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
}
public class CollectionsWithObjects {
	public static void main(String[] args) {
		List<student> list = new ArrayList<>();
		
		student s1 = new student(1,"name1","vizag");
		student s2 = new student(2,"name2","vizag");
		student s3 = new student(3,"name3","vizag");
		student s4 = new student(4,"name4","vizag");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.address);
		}
		
	}
}
