package com.in28min.oop;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Tesla", 0.3676, "red");
		
		
		fan.switchOn();
		System.out.println(fan);

		fan.setSpeed((byte) 3);
		System.out.println(fan);
		
		fan.switchOff();
		
		System.out.println(fan); 

	}

}
