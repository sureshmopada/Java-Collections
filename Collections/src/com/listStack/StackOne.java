package com.listStack;

import java.util.Stack;

public class StackOne {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		System.out.println(s);
	
		// removes the element from top	
//			s.pop();
//			System.out.println(s);
			
		// without removing element , returns top element
			//System.out.println(s.peek());
		
		
		// checks stack is empty or not (if not empty - false )	
//			System.out.println(s.empty());
		
		//returns the position of object
		System.out.println(s.search(1));
	}

}
