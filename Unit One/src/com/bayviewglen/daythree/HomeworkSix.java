package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
        int a = 3, b = -20, c = -50;	
		double root1, root2;
		
		root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		
		System.out.println("The roots are: " + root1 + " and " + root2);	
	}
  
}  
  