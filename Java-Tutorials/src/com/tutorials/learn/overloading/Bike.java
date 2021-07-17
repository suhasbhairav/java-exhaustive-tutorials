package com.tutorials.learn.overloading;

public class Bike {
	
	private int cost;
	private int mileage;
	private int year;
	
	public Bike() {
		this.cost = 50000;
		this.mileage = 90;
		this.year = 2000;
	}
	
	public Bike(int mileage) {
		this.mileage = mileage;
		this.year = 2015;
		this.cost = 98000;
	}
	
	public Bike(int cost, int mileage, int year) {
		this.cost = cost;
		this.mileage = mileage;
		this.year = year;
	}

}
