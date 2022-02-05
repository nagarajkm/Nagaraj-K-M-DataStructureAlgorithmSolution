package com.FloorAssembly;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Service {
	 Scanner sc=new Scanner(System.in);
	 LinkedList <Integer> ll=new LinkedList<>();
	 Stack<Integer> ss=new Stack<>();
	 Stack<Integer> sf=new Stack<>();
	 int TotalFloors;
	
	
	public void inputFromUser() {
		
	                  try {
						System.out.println("Enter the total no of floors in the building");
						  TotalFloors=sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Please enter interger no");
						
					}
	                  for(int i=1;i<= TotalFloors;i++) {
		              System.out.println("Enter the floor size give on day "+i);
		              int floorsize=sc.nextInt();
		              ll.add(floorsize);
		           		
	               }
	} 
	
	
	public void constructionOrder() {
		
		             System.out.println("The order construction is as follows:");
		             
		             for(int i=0;i<ll.size();i++) {
			         System.out.println("\nDay : "+(i+1));
			         
			          int n=TotalFloors;
			          int temp=ll.get(i);
			
			if(temp==n) {
				
				System.out.print(temp);
			
				Stack<Integer> sortedStack = sortedstack(ss);
								
					for(int j=0;j<sortedStack.size();j++) {
						
				           	while(sortedStack.contains(temp-1)) {
				             	System.out.print(","+sortedStack.remove(j));
									temp--;
								TotalFloors--;
					
				                }
					
			}	
					ss=(Stack<Integer>) sortedStack.clone();
					TotalFloors--;
	     	}
			else {
	     		ss.addElement(temp);
	     		
	     	}
		
	     }
	}
	 
public  Stack<Integer> sortedstack(Stack<Integer>ss){
		
		Stack<Integer> cs=(Stack)ss.clone();
		Stack <Integer> newstack=new Stack<Integer>();
		while(!cs.isEmpty()) {
			int temp=cs.pop();
			while(!newstack.isEmpty() && newstack.peek()<temp) {
				cs.push(newstack.pop());
			}
			newstack.push(temp);
		}
		
		
		return newstack;
		
	}
	

}
