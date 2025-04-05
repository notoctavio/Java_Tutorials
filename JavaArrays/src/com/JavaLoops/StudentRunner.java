package com.JavaLoops;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Ranga", 97,98,80,100);
		
		System.out.println(student.getNumberOfMarks()); 
		System.out.println(student.getTotalSumOfMarks()); 
		System.out.println(student.getMaximumMark()); 
		System.out.println(student.getMinimumMark()); 
		System.out.println(student.getAverageMarks());

		System.out.println(student);
		
		student.addMark(34);
		System.out.println(student);
		
		student.removeMarkAtIndex(3);
		System.out.println(student);


	}

}
 