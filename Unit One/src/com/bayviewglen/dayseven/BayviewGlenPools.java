package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewGlenPools {

	public static void main(String[] args) {

		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Please enter the length of the pool: ");
		double length = keyboard.nextDouble();
		System.out.print("Please enter the width of the pool: ");
		double width = keyboard.nextDouble();
		System.out.print("Please enter the depth of the shallow end: ");
		double shallow = keyboard.nextDouble();
		System.out.print("Please enter the depth of the deep end: ");
		double deep = keyboard.nextDouble();
		System.out.print("Please enter the length of the transition between the shallow end and deep end: ");
		double transition = keyboard.nextDouble();
		System.out.print("Please enter the length of the shallow end: ");
		double shallowLength = keyboard.nextDouble();
		
		
		// Calculate how much water needed to keep 90% full
		
		double volumeShallow = (shallowLength * width * shallow);
		
		double b = (deep - shallow);
		double a = Math.sqrt((transition*transition)-(b*b));
		double depthLength = ((a+shallowLength)-length);
		double volumeDeep = (depthLength * width * deep);
		
		double volumeA =(a*width*shallow);
		double volumeB = (a*b*width)/2;
		double volumeTransition = (volumeA +volumeB);
		
		double totalVolume = (volumeTransition+volumeShallow+volumeDeep);
		double desiredVolume = (totalVolume*0.9);
		
		System.out.println("To keep the pool 90% full you would need " + desiredVolume + " litres of water.");
		
		// Calculate amount of liner needed

		System.out.print("Please enter a price for a pool liner: ");
		double liner1 = keyboard.nextDouble();
		System.out.print("Please enter another price for a pool liner: ");
		double liner2 = keyboard.nextDouble();
		System.out.print("Please enter another price for a pool liner: ");
		double liner3 = keyboard.nextDouble();
		
		double area1 = (deep*width);
		double area2 = (shallow*width);
		double area3 = (depthLength*deep);
		double area4 = (shallowLength*shallow);
		double area5 = (a*width);
		double area6 = (b*a)/2;
		double area7 = (length*width);
		
		double areaLongSide = (area3 + area4 + area5 + area6)*2;
		double totalArea = (areaLongSide + area1 + area2 + area7);
		
		System.out.println("You would need " + totalArea + " metres squared of liner.");
		
		// Calculate Cost of liners
		
		double cost1 = (int)(liner1*totalArea*100);
		cost1 = (double) (cost1/100);
		double cost2 = (int)(liner2*totalArea*100);
		cost2 = (double) (cost2/100);
		double cost3 = (int)(liner3*totalArea*100);
		cost3 = (double) (cost3/100);
		
		System.out.println("The total cost of liner 1 would be " + cost1 + ".");
		System.out.println("The totalcost of liner 2 would be " + cost2 + ".");
		System.out.println("The totalcost of liner 2 would be " + cost3 + ".");
		
		keyboard.close();

		
				
		
		
		




		
		
	
		
		
		
	}

}
