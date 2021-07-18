package com.tutorials.learn.access;

import com.tutorials.learn.access.modifiers.Foo;

public class Bar extends Foo {
	
	private int sum = 20;
	
	private String address = "Urban";
	
	public void addSum() {
		sum += result; //it works
		
		//sum += num; -> Doesn't work
	}
	
	public void justConcat() {
		address += name;
		
		//sum += age; Doesn't work
	}
	
	

}
