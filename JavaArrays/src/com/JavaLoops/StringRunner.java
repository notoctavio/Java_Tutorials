package com.JavaLoops;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};
		String dayMC = "";
		
		for(String day:daysOfWeek) {
			if(day.length()>dayMC.length()) {
				dayMC = day;
			}
			
		}
		
		System.out.println("Day w most characters: " + dayMC);
		
		for(int i=daysOfWeek.length-1; i>=0 ;i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
