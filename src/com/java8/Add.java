package com.java8;

@FunctionalInterface
public interface Add {
	int add(int a ,int b);
	default int sub(int a ,int b) {
		return 0;
	}
	
	static void div() {
		System.out.println("static");
	}
	
	

}
