package com.introduction_to_OOP;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducatti = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducatti.start();
		honda.start();
		
		ducatti.setSpeed(100);
		System.out.println(ducatti.getSpeed());
		
		
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());

		
		ducatti.setSpeed(20);
		System.out.println(ducatti.getSpeed());

		honda.setSpeed(20);
		System.out.println(honda.getSpeed());

	}

}
