package com.tutorials.learn.enums;

public class Computer {
	
	public static void main(String[] args) {
		System.out.println(ComputerStandards.EXPERT);
		System.out.println(ComputerStandards.STANDARD);
		System.out.println(ComputerStandards.PROFESSIONAL);
		
		System.out.println(ProgrammingStandards.NOVICE);
		System.out.println(ProgrammingStandards.ADVANCED);
		System.out.println(ProgrammingStandards.EXPERT);
		
		ProgrammingStandards standard = ProgrammingStandards.ADVANCED;
		
		switch(standard) {
			case NOVICE:
				System.out.println("NOVICE...");
				break;
			case EXPERT:
				System.out.println("EXPERT...");
				break;
			case ADVANCED:
				System.out.println("Not as good as an expert...");
				break;
			default:
				System.out.println("OK");
				break;
				
		}
		
		System.out.println(SkyDiving.NOVICE.getValue());
		System.out.println(TouristPlaces.INDIA.getDesc());
	}
}
