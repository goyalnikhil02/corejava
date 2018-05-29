package com.java8;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static int sum(List<? super Integer> list){
		int sum = 0;
		for(Object n : list){
			sum += ((Integer) n).doubleValue();
		}
		return sum;
	}
public static void main(String[] args) {
	List<Number> intsList=new ArrayList<Number>();
	intsList.add(2);
	intsList.add(3);
System.out.println(sum(intsList));
long myInt = 127L;
int myLong =(int) myInt;
System.out.println(myInt);
}
}
