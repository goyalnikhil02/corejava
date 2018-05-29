package com.designpattern.factorypattern;

public class CarFactory {
	public static Car buildCar(CarType type )
	{
		Car car=null;
		switch(type) {
		case SMALL:
			car=new SmallCar();
			break;
		case LUXURY:
			car=new LuxuryCar();
			break;
		case SEDAN:
			car=new Sedan();
			break;
		default:
			break;
		}
		return car;
		
	}

}
