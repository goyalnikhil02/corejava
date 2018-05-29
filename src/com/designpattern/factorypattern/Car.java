package com.designpattern.factorypattern;

public abstract class Car {
	public CarType model=null;
	public Car(CarType model) {
		this.model=model;
		arrangeParts();
	}
	private void arrangeParts() {
		System.out.println("Arranging the parts");
		
	}
	
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	protected abstract void construct();

}
