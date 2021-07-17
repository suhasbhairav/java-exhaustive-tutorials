package com.tutorials.learn.overloading;

public class Building {
	
	private int year;
	private int size;
	private int cost;
	
	public Building() {
		this.year = 1980;
		this.size = 20000;
		this.cost = 5000000;
	}
	
	public Building(int year) {
		this.year = year;
		this.size = year * 25;
		this.cost = this.size * 50;
	}

	
	public Building(int year, int size, int cost) {
		this.year = year;
		this.size = size;
		this.cost = cost;
	}
}
