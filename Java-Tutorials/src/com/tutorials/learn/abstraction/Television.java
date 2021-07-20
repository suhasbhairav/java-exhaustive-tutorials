package com.tutorials.learn.abstraction;

public class Television extends ElectronicDevice {

	@Override
	public void turnOn() {
		System.out.println("Turning on.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off..");
		
	}
	
	public static void main(String[] args) {
		ElectronicDevice e = new Television();
		e.turnOn();
		e.printName();
		e.turnOff();
	}
	
	

}
