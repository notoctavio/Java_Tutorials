package com.in28min.javaloops;

public class MyNumber {

	private int number;
	
	
	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		
		if (number < 2) {
			return false;
		}
		
		
		for(int i = 2 ; i<=number-1; i++) {
			
			if(number%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=number; i++) {
			sum += i;
			
		}
		
		
		return sum;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 2; i<= number-1; i++) {
			if(number%i == 0) {
				 sum = sum + i;
			}
		}
		
		return sum;
		
	}

	public void printNumberTriangle() {
		for( int i=1; i<=number; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j + " " );
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}
}
