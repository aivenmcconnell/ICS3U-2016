package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3*6);	
		System.out.println(3+6);	
		System.out.println(3/6);	
		
		System.out.println(3.0*6);	
		System.out.println(3+6.0);	
		System.out.println(3.0/6);	
		
		System.out.println(3%6);	
		System.out.println(23%2);	
		System.out.println(458548%10);

		// Part B - Hi
		
		int num =940132;
		int digit1 = num/100000 ;
		int digit2 = num/10000%10;
		int digit3 = num/1000%10 ;
		int digit4 = num/100%10 ;
		int digit5 = num/10%10 ;
		int digit6 = num/10;
		int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
		System.out.println(sum);
	}

}
