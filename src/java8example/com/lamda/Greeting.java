package com.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greeting {

	public void greet(Greeter greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeting greetingObj = new Greeting();
// 1st way
		Greet greeter = new Greeter();
		
	// 2nd way
		Greet lambda     = ()              -> System.out.println("Greet the first lambda");
		
		lambda.perform();
		
		Add addTwoNumbers = (int a, int b) -> a + b;
		//greetingObj.greet(greeter);

		System.out.println(addTwoNumbers.add(1,2));
		
		// 3rd way annouyms inner class
		Greet innerClassObj=new Greeter()
				{
			public void perform()
			{
				System.out.println("Greet the first lambda");
				
			}
				};
				innerClassObj.perform();
				

	}
	
	@FunctionalInterface
	interface lambda {
		void foo();
	}
	
	@FunctionalInterface
	interface Add {
		int add(int a, int b);
	}
}

/*
 * List<String> list2=Arrays.asList("Kanishk","Goayl"); list2.forEach((data) ->
 * System.out.println("Greeting:"+ data));
 * 
 * List<String> list = new ArrayList<String>(); list.add("Nikhil");
 * list.add("GOYAL");
 * 
 * list.forEach( data -> System.out.println(data) );
 * 
 * 
 * list.forEach( data -> System.out.println(data) ); list.forEach((data) ->
 * System.out.println("::"));
 * 
 */