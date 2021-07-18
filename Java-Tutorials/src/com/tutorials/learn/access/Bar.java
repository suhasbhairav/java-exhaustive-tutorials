package com.tutorials.learn.access;

import com.tutorials.learn.access.modifiers.Foo;

public class Bar extends Foo {
	
	private int sum = 20;
	
	public void addSum() {
		sum += result; //it works
		
		//sum += num; -> Doesn't work
	}

}
