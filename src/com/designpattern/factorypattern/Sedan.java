package com.designpattern.factorypattern;

public class Sedan extends Car{

	public Sedan() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("arranging the sedan specfic parts");
		
	}

}
