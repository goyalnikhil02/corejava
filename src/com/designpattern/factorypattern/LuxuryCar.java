
package com.designpattern.factorypattern;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("In Luxury Car parts");

	}
}
