package com.rmuti.Lab3;



public class BinaryTree {

	  Node root;
	 	 
	  	    public void addNode(int key,String name) {
	  	
	  	    Node NewNode = new Node(key, name);
	  	     
	  	    if (root == null) {
	  	    	root = NewNode;
	  	 
	  	        } else {
	  	 
	  	         Node FocusNode = root;
	  	         Node parent;
	  	 
	  	          while (true) {
	  	 
	  	          parent = FocusNode;
	  	
	  	          if (key < FocusNode.key) {
	  	               FocusNode = FocusNode.leftChild;
	  	 
	  	          if (FocusNode == null) {
	  	        	  parent.leftChild = NewNode;
	  	        	  
	  	              return; 
	  	 
	  	                    }
	  	 
	  	            } else { 
	  	 
	  	                    FocusNode = FocusNode.rightChild;
	  	 
	  	           if (FocusNode == null) {
	  	 
	  	                   parent.rightChild = NewNode;
	  	                        return; // 
	  	 
	  	                    }
	  	 
	  	                }
	  	 
	  	            }
	  	        }
	  	 
	  	    }
	  	 
	  	   
	  	 
	  	    public void inOrderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	           inOrderTraverse(focusNode.leftChild);
	  	 
	  	           System.out.println(focusNode);
	  	 
	  	           inOrderTraverse(focusNode.rightChild);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public void preorderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	            System.out.println(focusNode);
	  	 
	  	            preorderTraverse(focusNode.leftChild);
	  	            preorderTraverse(focusNode.rightChild);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public void postOrderTraverse(Node focusNode) {
	  	 
	  	        if (focusNode != null) {
	  	 
	  	            postOrderTraverse(focusNode.leftChild);
	  	            postOrderTraverse(focusNode.rightChild);
	  	 
	  	            System.out.println(focusNode);
	  	 
	  	        }
	  	 
	  	    }
	  	 
	  	    public Node findNode(int key) {
	  
	  	        Node focusNode = root;
	  	 
	  	     
				while (focusNode.key != key) {
				if (key < focusNode.key) {
	  	 
	  	            focusNode = focusNode.leftChild;
	  	 
	  	            } else {
	  	 
	  	               focusNode = focusNode.rightChild;
	  	 
	  	            }
	  	 
	  	          
	  	 
	  	            if (focusNode == null)
	  	                return null;
	  	 
	  	        }
	  	 
	  	        return focusNode;
	  	 
	  	    }
	  	 
	  	public static void main(String[] args) {
	  	 
	  	        BinaryTree theTree = new BinaryTree();
	  	 
	  	        theTree.addNode(50,"A");
	  	
	  	        theTree.addNode(25, "B");
	  	 
	  	        theTree.addNode(75,"C");
	  	 
	  	        theTree.addNode(15,"D");
	  	 
	  	        theTree.addNode(30, "E");
	  	 
	  	        theTree.addNode(85,"F ");
	  	 
	  	         theTree.inOrderTraverse(theTree.root);
	  	 
	  	         theTree.preorderTraverse(theTree.root);
	  	 
	  	         theTree.postOrderTraverse(theTree.root);
	  	 
	  	        
	  	 
	  	      System.out.println("\nNode with  key ");
	  	 
	  	      System.out.println(theTree.findNode(25));
	  	      System.out.println(theTree.root);
	  	}
	  	}
	  	 
	  class Node {
	  	 
	  	   int key;
	  	 String name;
	  	 
	  	    Node leftChild;
	  	    Node rightChild;
	  	 
	  	  Node(int key, String name){
	  	 
	  	       this.key = key;
	  	       this.name = name;
	  	 
	  	    }
	  	 
	  	   public String toString() {
	  	 
	  	       return name + "  " ;
	  	 
	  	   }
	  	 
	  }
	 


