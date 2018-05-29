package com.java8;

public class Student {
	public String name;
	public int rollno;

	public Student(String name, int rollno) {		
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollano() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rollno+"::"+this.name;
	}

}
