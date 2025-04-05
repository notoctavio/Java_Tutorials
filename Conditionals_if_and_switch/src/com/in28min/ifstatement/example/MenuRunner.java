package com.in28min.ifstatement.example;

import java.util.Scanner;

public class MenuRunner {
	 public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		
		
		System.out.println(" 1 - Add \n 2 - Substract \n 3 - Divide \n 4 - Multiply ");
		System.out.println("Choose Operation: ");
		int operation = scanner.nextInt();
		
		
		System.out.println("Your result is: ");
		nestedIfElse(number1, number2, operation);
		switchOperation(number1,number2,operation);
		
		
		  

		
	}

	private static void nestedIfElse(int number1, int number2, int operation) {
		if(operation==1) {
			System.out.println(number1+number2);
		}else if(operation==2) {
			System.out.println(number1-number2);
		}else if(operation==3) {
			System.out.println(number1/number2);
		}else if(operation==4) {
			System.out.println(number1*number2);
		}else{
			System.out.println("Not an option.");
		}
	}
	
	private static void switchOperation(int number1, int number2, int operation) {
		switch(operation) {
		case 1 : 
			System.out.println(number1+number2);
			break;
		case 2: 
			System.out.println(number1-number2);
			break;
		case 3:
			System.out.println(number1/number2);
			break;
		case 4: 
			System.out.println(number1*number2);
			break;
		default: 
			System.out.println("Not an option.");
			break;
			}
	}
}
