package io.javabrains.unit1;

public class Unit3 {

	public static void printMessage()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("HEllo");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t=new Thread(Unit3::printMessage);
		t.start();
		

	}

}
