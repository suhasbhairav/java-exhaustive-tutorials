package com.tutorials.learn.abstraction;

public class ShowFinal {
	
	//Cannot be changed
	public final int val = 100;
	
	//Is static and cannot be changed
	public static final String name = "Java";
	
	public static void main(String[] args) {
		System.out.println(ShowFinal.name);
		
		ShowFinal s = new ShowFinal();
		System.out.println(s.val);
	}

}
