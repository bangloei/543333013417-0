package com.rmuti.datastructure;

import java.util.Stack;


public class ArrayListStack {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("a");
		s.add("b");
		System.out.println(s);
		//System.out.println(max(s));
		
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
	
	public static int max(Stack<Integer> s){
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue = s.pop();
		backup.push(maxValue);
	
		
	while (!s.isEmpty()){
		int next = s.pop();
		backup.push(next);
		maxValue = Math.max(maxValue, next);
	}
	
	
	while (!backup.isEmpty()){
		s.push(backup.pop());
	}
	
return maxValue;
	}
}
