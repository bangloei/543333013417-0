package com.rmuti.Lab2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ArrayPQ {
	
private ArrayList<Object> lst;

public ArrayPQ() {
lst = new ArrayList<Object>();
 }

public void enqueue(Object e) {
lst.add(lst.size(), e);
 }

 public Object dequeue() {
  int maxIndex = maxIndex();
  Object maxObj = lst.get(maxIndex);
  lst.remove(maxIndex);
  return maxObj;
  }

  public Object peek() {
   return lst.get(maxIndex());
   }

  private int maxIndex() {
  int max = 0;
  for (int i = 0; i < lst.size(); i++) {
   Comparable<Object> d = (Comparable<Object>) lst.get(i);
    	Object maxObj = lst.get(max);
   if (d.compareTo(maxObj) > 0) {
    max = i;
    }
    }
  
    return max;

 }


	public static void main(String[] args) {
		Car c1 = new Car("Yamaha",1,3000000);
		Car c2 = new Car("Honda",5,850000);
		Car c3 = new Car("zuzuki",3,870000);
		
		
		PriorityQueue<Car> B = new PriorityQueue<Car> ();
		B.add(c1);
		B.add(c2);
		B.add(c3);
		
		int count = 1;
		
		while (!B.isEmpty()){
			//System.out.println(otherWay);
			System.out.println("P.Q"+ count +"<-->"+B.remove());
			count++;	
			System.out.println();
		}
			
	}
	}
	




