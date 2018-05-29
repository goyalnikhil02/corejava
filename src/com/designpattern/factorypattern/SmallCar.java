package com.designpattern.factorypattern;



public class SmallCar extends Car {

	public SmallCar() {
	super(CarType.SMALL);
	construct();
	}

	@Override
	protected void construct() {
		System.out.println("Arranging the small car parts ");
		
	}
}
