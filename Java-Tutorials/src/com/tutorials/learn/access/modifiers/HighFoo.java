package com.tutorials.learn.access.modifiers;

public class HighFoo {
	
	private int mileage = 25;
	
	protected int getMileage() {
		return mileage;
	}
	
	protected double justRandom() {
		return mileage * Math.random();
	}

}
