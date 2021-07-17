package com.tutorials.learn.overloading;

public class Box {

	private int length;
	private int width;
	private int height;
	
	public Box() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}
	
	public Box(int length) {
		this.length = length;
		this.width = 2;
		this.height = 2;
	}
	
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
}
