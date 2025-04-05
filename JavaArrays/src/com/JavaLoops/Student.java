package com.JavaLoops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	Student(String name, int... marks){
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		System.out.print("Number of marks: ");
		return marks.size();
		
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		
		System.out.print("Sum of marks: ");
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
//		int max = Integer.MIN_VALUE;
//		
//		for(int mark:marks) {
//			if(mark>max) {
//				max = mark;
//			}
//		}
		
//		System.out.print("Maximum mark is: ");
//		return max;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
//		int min = Integer.MAX_VALUE;
//		
//		for(int mark:marks) {
//			if(mark<min) {
//				min = mark;
//			}
//		}
//		
//		System.out.print("Minimum mark is: ");
//		return min;
		
		return Collections.min(marks);

	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	
	public String toString() {
		return name+marks;
	}

	public void addMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
		
	}

	public void removeMarkAtIndex(int index) {
		
		marks.remove(index);
		// TODO Auto-generated method stub
		
	}
	

}
