package com.rmuti.Lab4;


public class Sorting {

private int[] ArraySorting = new int[50];
		     
private int ArraySortSize = 10;
		     
public void RandomArray(){
		         
 for(int i = 0; i < ArraySortSize; i++){
		             
	 ArraySorting[i] = (int)(Math.random()*10)+10;
		             
	 }
		         
		    }
 public void PrintArray(){
		    		         
		     System.out.println("----------");
 for(int i = 0; i < ArraySortSize; i++){
	 
		    System.out.print("| " + i + " | ");
		    System.out.println(ArraySorting[i] + " |");
		    		             
		    System.out.println("----------");
		    		             
		    		        }
		    		         
		    		    }
		    		     
	public int ValueAtIndex(int index){
		    		         
		 if(index < ArraySortSize) return ArraySorting[index];
		    		         
		  return 0;
		    		         
		    		    }
	
	 public boolean ArrayContainValue(int searchValue){
		    		    		         
		    boolean valueInArray = false;
		    		    		         
		    for(int i = 0; i < ArraySortSize; i++){
		    		    		             
		    if(ArraySorting[i] == searchValue){
		    		    		                 
		     valueInArray = true;
		    		    		                 
		    		    		            }
		    		    		             
		    		    		        }
		    		    		         
		     return valueInArray; }
		    		    	     
	public void DeleteIndex(int index){
		    		    	         
		  if(index < ArraySortSize){
		    		   	             
		 for(int i = index; i < (ArraySortSize - 1); i++){
		    		    	                 
			 ArraySorting[i] = ArraySorting[i+1];
		    		    	                 
		    }
		    		    	             
		 ArraySortSize--;
		    		    	             
		    }
		    		    	         
		   }
	
	 
		    		    	    		     
	public void HorzArray(int i, int j){
		    		    	    		         
		 for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		 System.out.println();
		    		    	    		         
		  for(int n = 0; n < ArraySortSize; n++){
		    		    	    		             
		System.out.print("| " + n + "  ");
 }
		    		    	    		         
		 System.out.println("|");
		    		    	    		         
	for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		 System.out.println();
		    		    	    		         
	for(int n = 0; n < ArraySortSize; n++){
		    		    	    		             
		System.out.print("| " + ArraySorting[n] + " ");
 }
		    		    	    		         
		System.out.println("|");
		    		    	    		         
 for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		System.out.println();
		    		    	    		         
	 if(j != -1){
		    		    	    	         
	 for(int k = 0; k < ((j*5)+2); k++)
		 System.out.print(" ");
		 System.out.print(j);
 }
		    		    	    		         
	  if(i != -1){
	  for(int l = 0; l < (5*(i - j)-1); l++)
		  System.out.print(" ");
		  System.out.print(i);
   }
		  System.out.println(); }
		    		    	    		     
	 public void BubbleSort(){
		 
	for(int i = ArraySortSize - 1; i > 1; i--){
		    		    	    		                 
	 for(int j = 0; j < i; j++){
		    		    	    		                     
	 if(ArraySorting[j] > ArraySorting[j + 1]){
		    		    	    		                         
		 swapValues(j, j+1);
		    		    	    		                         
		 HorzArray(i, j);  }
		    		    	    		                     
		 }
		     }
		 }
		    		    	    		         
	 public void swapValues(int indexOne, int indexTwo){
		    		    	    		             
		 int temp = ArraySorting[indexOne];
		 ArraySorting[indexOne] = ArraySorting[indexTwo];
		 ArraySorting[indexTwo] = temp;
		    		    	    		             
	 }
		    		    	    		         
		 public void binarySearchForValue(int value){
		    		    	    		             
		 int lowIndex = 0;
		 int highIndex = ArraySortSize - 1;
		    		    	    		             
	 while(lowIndex <= highIndex){
		    		    	    		                 
		 int middleIndex = (highIndex + lowIndex) / 2;
		 if(ArraySorting[middleIndex] < value) lowIndex = middleIndex + 1;
		    		    	    		                 
		else if(ArraySorting[middleIndex] > value) highIndex = middleIndex - 1;
		    		    	    		                 
		 else {
		    		    	    		                     
		System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
		    		    	    		                     
		 lowIndex = highIndex + 1; }
		    		    	    		                 
		 HorzArray(middleIndex, -1); }
		    		    	    		             
		  }
		    		    	    		         
	 public void SelectionSort(){
		    		    	    		             
	 for(int x=0; x < ArraySortSize; x++){
	 int minimum = x;
		    		    	    		                   
	 for(int y=x; y < ArraySortSize; y++){
		 
     if(ArraySorting[minimum]>ArraySorting[y]){
	 minimum = y;  }
	  }
		    		    	    		                   
	  swapValues(x, minimum);
		    		    	    		                   
	  HorzArray(x, -1);  }
		    		    	    		             
		 }
	 
	 public void InsertionSort(){
		    		    	    		             
	 for (int i = 1; i < ArraySortSize; i++){
		 
	  int j = i;
	  int toInsert = ArraySorting[i];
	  
	  while ((j > 0) && (ArraySorting[j-1] > toInsert)){
		  ArraySorting[j] = ArraySorting[j-1];
		 j--;
		    		    	    		                       
		 HorzArray(i, j); }
	  
	  ArraySorting[j] = toInsert;
	  HorzArray(i, j);
	     System.out.println("\nArray[i] = " + ArraySorting[i] + " Array[j] = " + ArraySorting[j] + " toInsert = " + toInsert + "\n");
	 }
		    		    	    		             
		 }
		    		    	    		     
		 public static void main(String[] args){
		    		    	    		         
		Sorting newArray = new Sorting();
		    		    	    		         
		 newArray.RandomArray();
		    		    	    		           		    	    		         
		 newArray.BubbleSort();
		 
		 newArray.SelectionSort();
		    		    	    		         
		newArray.InsertionSort();
		    		    	    		         
		      }
		    		    	    		 
		    		    	    		}
		    		    	    	
