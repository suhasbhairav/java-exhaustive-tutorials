package com.tutorials.learn.overloading;

public class Car {
	
	private int carId;
	private String carName;
	private String carModel;
	private String carManufacturer;
	private String emissionStandard;
	
	public Car(int carId, String carName, String carModel, String carManufacturer, String emissionStandard) {
		this.carId = carId;
		this.carName = carName;
		this.carModel = carModel;
		this.carManufacturer = carManufacturer;
		this.emissionStandard = emissionStandard;
	}
	
	public void print(String carInfo) {
		System.out.println(carInfo);
	}
	
	public void print(int carId) {
		System.out.println(carId);
	}

}
