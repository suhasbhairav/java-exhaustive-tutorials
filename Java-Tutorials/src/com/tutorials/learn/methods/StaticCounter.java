package com.tutorials.learn.methods;

public class StaticCounter {
	
	private static int counter = 0;
	private static int counter2 = 100;
	
	public static int getCounter() {
		return counter;
	}
	
	public static void increment() {
		counter++;
	}
	
	public static void decrement() {
		counter--;
	}
	
	public static int getCounter2() {
		return counter2;
	}
	
	public static void increment2() {
		counter2++;
	}
	
	public static void decrement2() {
		counter2--;
	}

}
