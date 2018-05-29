package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DefaultTest implements Add ,Add2{

	public static void main(String[] args) {
	DefaultTest d=new DefaultTest();
	System.out.println(d.add(1, 2));
	
	System.out.println(d.sub(1, 2));
	Add.div();
	Add2.div();
	System.out.println();
	
	
	//stream example
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	//List<String> filtered = 
	strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);;
	//filtered.forEach(System.out::println);
	/*for(String a:filtered)
	{
		System.out.println(a);
	}*/
	
	
	
	
	}

	
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return Add.super.sub(a, b);
	}
	
	

}
