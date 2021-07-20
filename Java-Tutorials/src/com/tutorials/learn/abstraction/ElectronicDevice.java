package com.tutorials.learn.abstraction;

public abstract class ElectronicDevice {
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void printName() {
		System.out.println("This method is inherited from the abstract class");
	}

}
