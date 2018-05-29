package com.java8;

public interface Add2 {
	default int sub(int a ,int b) {
		return 1;
	}
	static void div() {
		System.out.println("static 2");
	}

}
