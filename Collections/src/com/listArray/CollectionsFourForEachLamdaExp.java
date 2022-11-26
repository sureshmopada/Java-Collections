package com.listArray;
import java.util.*;

public class CollectionsFourForEachLamdaExp {
public static void main(String[] args) {

	List<String> al = new ArrayList<>();
	al.add("Suresh");
	al.add("Mepada");
	al.add("java");
	al.add("javaScript");
	// adding element
	al.add(2,"program");
	//print values that stored in list using forEach with lamda expression
	// forEach using lamda expression ( ->  symbol (arrowMark) )
	
	Iterator<String> itr = al.iterator();
	al.forEach(a ->{
		System.out.println(a);
		
	});
}
}