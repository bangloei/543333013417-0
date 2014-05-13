package com.rmuti.Lab2;



public class Car  implements Comparable<Car> {

	 private String name; 
	 private int type; 
	 private int price;
	 
	 public Car (String N ,int U ,int T ){
	 name = N;
	 type = U;
	 price = T;
	 }
	 public String getName() {return name;}
	 public int getType() {return type;}
	 public int getPrice() {return price;}
	 
	 public boolean equals(Car Other){
		 return this.getName().equals(Other.getName());
	 }
	 
	 public int compareTo(Car Other){
//return this.getName().compareTo(getName());
		 if(this.equals(Other))
			return 0;
		
		 else if(getPrice() < Other.getPrice())
			return 1;
		
		else 
			return -1;
	 }
	 
	 public String toString(){
		 return "{Name :"+ getName() +"\tType :"+ getType() +"\tPrice :"+ getPrice() + "}";
	 }
	
	 
	 }