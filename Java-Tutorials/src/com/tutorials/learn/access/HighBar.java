package com.tutorials.learn.access;

import com.tutorials.learn.access.modifiers.HighFoo;

public class HighBar extends HighFoo {
	
	private int sum = 100;
	
	protected void justPrint() {
		sum += getMileage();
	}
	
	protected void onlyRandom() {
		sum += justRandom();
	}

}
