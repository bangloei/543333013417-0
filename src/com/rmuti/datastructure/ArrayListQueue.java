package com.rmuti.datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class ArrayListQueue {

	public static void main(String[] args) {
		PriorityQueue<String>  s = new PriorityQueue<String>();
		s.offer("a");
		s.offer("b");
		System.out.printf("%s", s);
		System.out.println(); 
		
		System.out.printf("%s",s.peek());
		
		
		s.poll();
		
		System.out.println("");
		
		
		while (!s.isEmpty()){
			System.out.println(s.poll());
		}
	}
	
	public static int enqueue(Stack<Integer> s){
		Stack<Integer> backup = new Stack<Integer>();
		int dequeue = s.pop();
		backup.push(dequeue);
	
		
	while (!s.isEmpty()){
		int next = s.pop();
		backup.push(next);
		dequeue = Math.max(dequeue, next);
	}
	
	
	while (!backup.isEmpty()){
		s.push(backup.pop());
	}
	
return dequeue;
	}
}
