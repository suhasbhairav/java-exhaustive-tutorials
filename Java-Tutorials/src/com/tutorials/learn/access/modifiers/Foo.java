package com.tutorials.learn.access.modifiers;

public class Foo {
	protected int result = 205;
	
	//By default, the access modifier is default. Hence, cannot be accessed by classes
	//and subclasses in a different package
	int num = 25;
	
	protected String name = "Bangalore";
	
	int age = 10;

}
