package com.designpattern.factorypattern;

public class CarMain {

	public static void main(String[] args) {
	System.out.println(CarFactory.buildCar(CarType.SMALL));
	}

}
