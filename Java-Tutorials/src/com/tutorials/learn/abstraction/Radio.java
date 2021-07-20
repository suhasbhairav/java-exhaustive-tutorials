package com.tutorials.learn.abstraction;

public class Radio extends ElectronicDevice {

	@Override
	public void turnOn() {
		System.out.println("Turning on Radio.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off Radio.");
		
	}
	
	public final void justBroadcast() {
		System.out.println("Broadcast...");
	}
	
	public static void main(String[] args) {
		ElectronicDevice e = new Radio();
		e.turnOn();
		e.printName();
		e.turnOff();
	}

}
