package com.tutorials.learn.overriding.object.methods;

public class Statistics {

	public float average(int...nums) {
		int sum = 0;
		for(int x: nums) {
			sum += x;
		}
		
		return (float)sum/nums.length;
	}
	
	public double average(double...nums) {
		double sum = 0;
		for(double x : nums) {
			sum += x;
		}
		
		return sum/nums.length;
	}
}
