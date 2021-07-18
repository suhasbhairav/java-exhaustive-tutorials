package com.tutorials.learn.methods;

public class StaticInitializerBlocks {
	private static final int[] values = new int[5];
	
	static {
		System.out.println("Initializing...");
		for(int i=0; i<values.length; i++) {
			values[i] = (int) (i * Math.random() * 200);
		}
		for(int i=0; i<values.length;i++) {
			System.out.println(values[i]);
		}
	}
	
	public static void main(String[] args) {
		//Just run this
	}

}
