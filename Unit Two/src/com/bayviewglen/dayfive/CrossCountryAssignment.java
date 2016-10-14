package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JTable;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat ("00.000");
		
		final int time = 60;
	
		// Runner 1
		
		System.out.print("Please enter your first and last name: ");
		String name1 = scanner. nextLine();
		String firstName =(name1.split(" ")[0]);
		String lastName = (name1.split(" ")[1]);
		
		
		System.out.print(firstName + ", enter your mile one time (mm:ss.sss): ");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		double seconds = Double.parseDouble(time1.split(":")[1]);
		
		System.out.print(firstName + ", enter your time to the end of the second mile (mm:ss.sss): ");
		String time2 = scanner.nextLine();
		int minutes2 = Integer.parseInt(time2.split(":")[0]);
		double seconds2 = Double.parseDouble(time2.split(":")[1]);
		
		System.out.print(firstName + ", enter your time to the end of the 5km (mm:ss.sss): ");
		String time3 = scanner.nextLine();
		int minutes3 = Integer.parseInt(time3.split(":")[0]);
		double seconds3 = Double.parseDouble(time3.split(":")[1]);
		
		double minSec1 = (minutes * time)+ seconds;
		double minSec2 = (minutes2 * time)+ seconds2;
		double minSec3 = (minutes3 * time)+ seconds3;
		
		String split1 = time1;
		String split2 = "" + ((int)(minSec2-minSec1)/time)+":"+formatter.format((minSec2 - minSec1)%time);
		String split3 = "" + ((int)(minSec3-minSec2)/time)+":"+formatter.format((minSec3 - minSec2)%time);
		
		System.out.println("Runner One Summary");
		System.out.println("Split One: " +split1);
		System.out.println("Split Two: " +split2);
		System.out.println("Split Three: " +split3);
		System.out.println("Total: " +time3);
		
		// Runner 2
		
		System.out.print ("Please enter your first and last name: ");
		String name2 = scanner. nextLine();
		String firstName2 =(name2.split(" ")[0]);
		String lastName2 = (name2.split(" ")[1]);
				
				
		System.out.print(firstName2 + ", enter your mile one time (mm:ss.sss): ");
		String runnerTwoTime1 = scanner.nextLine();
		int runnerTwoMinutes1 = Integer.parseInt(runnerTwoTime1.split(":")[0]);
		double runnerTwoSeconds1 = Double.parseDouble(runnerTwoTime1.split(":")[1]);
				
		System.out.print(firstName2 + ", enter your time to the end of the second mile (mm:ss.sss): ");
		String runnerTwoTime2 = scanner.nextLine();
		int runnerTwoMinutes2 = Integer.parseInt(runnerTwoTime2.split(":")[0]);
		double runnerTwoSeconds2 = Double.parseDouble(runnerTwoTime2.split(":")[1]);
				
		System.out.print(firstName2 + ", enter your time to the end of the 5km (mm:ss.sss): ");
		String runnerTwoTime3 = scanner.nextLine();
		int runnerTwoMinutes3 = Integer.parseInt(runnerTwoTime3.split(":")[0]);
		double runnerTwoSeconds3 = Double.parseDouble(runnerTwoTime3.split(":")[1]);
				
		double runnerTwoMinSec1 = (runnerTwoMinutes1 * time)+ runnerTwoSeconds1;
		double runnerTwoMinSec2 = (runnerTwoMinutes2 * time)+ runnerTwoSeconds2;
		double runnerTwoMinSec3 = (runnerTwoMinutes3 * time)+ runnerTwoSeconds3;
				
		String runnerTwoSplit1 = runnerTwoTime1;
		String runnerTwoSplit2 = "" + ((int)(runnerTwoMinSec2-runnerTwoMinSec1)/time)+":"+formatter.format((runnerTwoMinSec2 - runnerTwoMinSec1)%time);
		String runnerTwoSplit3 = "" + ((int)(runnerTwoMinSec3-runnerTwoMinSec2)/time)+":"+formatter.format((runnerTwoMinSec3 - runnerTwoMinSec2)%time);
				
		System.out.println("Runner Two Summary");
		System.out.println("Split One: " + runnerTwoSplit1);
		System.out.println("Split Two: " +runnerTwoSplit2);
		System.out.println("Split Three: " +runnerTwoSplit3);
		System.out.println("Total: " +runnerTwoTime3);
				
		// Runner 3
				
		System.out.print ("Please enter your first and last name: ");
		String name3 = scanner. nextLine();
		String firstName3 =(name3.split(" ")[0]);
		String lastName3 = (name3.split(" ")[1]);
				
				
		System.out.print(firstName3 + ", enter your mile one time (mm:ss.sss): ");
		String runnerThreeTime1 = scanner.nextLine();
		int runnerThreeMinutes = Integer.parseInt(runnerThreeTime1.split(":")[0]);
		double runnerThreeSeconds = Double.parseDouble(runnerThreeTime1.split(":")[1]);
				
		System.out.print(firstName3 + ", enter your time to the end of the second mile (mm:ss.sss): ");
		String runnerThreeTime2 = scanner.nextLine();
		int runnerThreeMinutes2 = Integer.parseInt(runnerThreeTime2.split(":")[0]);
		double runnerThreeSeconds2 = Double.parseDouble(runnerThreeTime2.split(":")[1]);
				
		System.out.print(firstName3 + ", enter your time to the end of the 5km (mm:ss.sss): ");
		String runnerThreeTime3 = scanner.nextLine();
		int runnerThreeMinutes3 = Integer.parseInt(runnerThreeTime3.split(":")[0]);
		double runnerThreeSeconds3 = Double.parseDouble(runnerThreeTime3.split(":")[1]);
				
		double runnerThreeMinSec1 = (runnerThreeMinutes * time)+ runnerThreeSeconds;
		double runnerThreeMinSec2 = (runnerThreeMinutes2 * time)+ runnerThreeSeconds2;
		double runnerThreeMinSec3 = (runnerThreeMinutes3 * time)+ runnerThreeSeconds3;
				
		String runnerThreeSplit1 = runnerThreeTime1;
		String runnerThreeSplit2 = "" + ((int)(runnerThreeMinSec2-runnerThreeMinSec1)/time)+":"+formatter.format((runnerThreeMinSec2 - runnerThreeMinSec1)%time);
		String runnerThreeSplit3 = "" + ((int)(runnerThreeMinSec3-runnerThreeMinSec2)/time)+":"+formatter.format((runnerThreeMinSec3 - runnerThreeMinSec2)%time);
				
		System.out.println("Runner Three Summary");
		System.out.println("Split One: " +runnerThreeSplit1);
		System.out.println("Split Two: " +runnerThreeSplit2);
		System.out.println("Split Three: " +runnerThreeSplit3);
		System.out.println("Total: " +runnerThreeTime3);

		// Runner 4
		
		System.out.print ("Please enter your first and last name: ");
		String name4 = scanner. nextLine();
		String firstName4 =(name4.split(" ")[0]);
		String lastName4 = (name4.split(" ")[1]);
				
				
		System.out.print(firstName4 + ", enter your mile one time (mm:ss.sss): ");
		String runnerFourTime1 = scanner.nextLine();
		int runnerFourMinutes = Integer.parseInt(runnerFourTime1.split(":")[0]);
		double runnerFourSeconds = Double.parseDouble(runnerFourTime1.split(":")[1]);
				
		System.out.print(firstName4 + ", enter your time to the end of the second mile (mm:ss.sss): ");
		String runnerFourTime2 = scanner.nextLine();
		int runnerFourMinutes2 = Integer.parseInt(runnerFourTime2.split(":")[0]);
		double runnerFourSeconds2 = Double.parseDouble(runnerFourTime2.split(":")[1]);
				
		System.out.print(firstName4 + ", enter your time to the end of the 5km (mm:ss.sss): ");
		String runnerFourTime3 = scanner.nextLine();
		int runnerFourMinutes3 = Integer.parseInt(runnerFourTime3.split(":")[0]);
		double runnerFourSeconds3 = Double.parseDouble(runnerFourTime3.split(":")[1]);
				
		double runnerFourMinSec1 = (runnerFourMinutes * time)+ runnerFourSeconds;
		double runnerFourMinSec2 = (runnerFourMinutes2 * time)+ runnerFourSeconds2;
		double runnerFourMinSec3 = (runnerFourMinutes3 * time)+ runnerFourSeconds3;
				
		String runnerFourSplit1 = runnerFourTime1;
		String runnerFourSplit2 = "" + ((int)(runnerFourMinSec2-runnerFourMinSec1)/time)+":"+formatter.format((runnerFourMinSec2 - runnerFourMinSec1)%time);
		String runnerFourSplit3 = "" + ((int)(runnerFourMinSec3-runnerFourMinSec2)/time)+":"+formatter.format((runnerFourMinSec3 - runnerFourMinSec2)%time);
				
		System.out.println("Runner Four Summary");
		System.out.println("Split One: " +runnerFourSplit1);
		System.out.println("Split Two: " +runnerFourSplit2);
		System.out.println("Split Three: " +runnerFourSplit3);
		System.out.println("Total: " +runnerFourTime3);
	
		//Runner 5
		
		System.out.print ("Please enter your first and last name: ");
		String name5 = scanner. nextLine();
		String firstName5 =(name5.split(" ")[0]);
		String lastName5 = (name5.split(" ")[1]);
				
				
		System.out.print(firstName5 + ", enter your mile one time (mm:ss.sss): ");
		String runnerFiveTime1 = scanner.nextLine();
		int runnerFiveMinutes = Integer.parseInt(runnerFiveTime1.split(":")[0]);
		double runnerFiveSeconds = Double.parseDouble(runnerFiveTime1.split(":")[1]);
				
		System.out.print(firstName5 + ", enter your time to the end of the second mile (mm:ss.sss): ");
		String runnerFiveTime2 = scanner.nextLine();
		int runnerFiveMinutes2 = Integer.parseInt(runnerFiveTime2.split(":")[0]);
		double runnerFiveSeconds2 = Double.parseDouble(runnerFiveTime2.split(":")[1]);
				
		System.out.print(firstName5 + ", enter your time to the end of the 5km (mm:ss.sss): ");
		String runnerFiveTime3 = scanner.nextLine();
		int runnerFiveMinutes3 = Integer.parseInt(runnerFiveTime3.split(":")[0]);
		double runnerFiveSeconds3 = Double.parseDouble(runnerFiveTime3.split(":")[1]);
				
		double runnerFiveMinSec1 = (runnerFiveMinutes * time)+ runnerFiveSeconds;
		double runnerFiveMinSec2 = (runnerFiveMinutes2 * time)+ runnerFiveSeconds2;
		double runnerFiveMinSec3 = (runnerFiveMinutes3 * time)+ runnerFiveSeconds3;
				
		String runnerFiveSplit1 = runnerFiveTime1;
		String runnerFiveSplit2 = "" + ((int)(runnerFiveMinSec2-runnerFiveMinSec1)/time)+":"+formatter.format((runnerFiveMinSec2 - runnerFiveMinSec1)%time);
		String runnerFiveSplit3 = "" + ((int)(runnerFiveMinSec3-runnerFiveMinSec2)/time)+":"+formatter.format((runnerFiveMinSec3 - runnerFiveMinSec2)%time);
				
		System.out.println("Runner Five Summary");
		System.out.println("Split One: " +runnerFiveSplit1);
		System.out.println("Split Two: " +runnerFiveSplit2);
		System.out.println("Split Three: " +runnerFiveSplit3);
		System.out.println("Total: " +runnerFiveTime3);
		
		
		
		// Table
		String header1 = "Last Name";
		String header2 = "First Name";
		String header3 = "Split One Time";
		String header4 = "Split Two Time";
		String header5 = "Split Three Time";
		String header6 = "Total Time";
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n",header1, header2, header3, header4, header5, header6);
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-25s \n",lastName, firstName, split1, split2, split3, time3);
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-25s \n",lastName2, firstName2, runnerTwoSplit1, runnerTwoSplit2, runnerTwoSplit3, runnerTwoTime3);
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-25s \n",lastName3, firstName3, runnerThreeSplit1, runnerThreeSplit2, runnerThreeSplit3, runnerThreeTime3);
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-25s \n",lastName4, firstName4, runnerFourSplit1, runnerFourSplit2, runnerFourSplit3, runnerFourTime3);
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-25s \n",lastName5, firstName5, runnerFiveSplit1, runnerFiveSplit2, runnerFiveSplit3, runnerFiveTime3);
		
		scanner.close();
		}
	}


