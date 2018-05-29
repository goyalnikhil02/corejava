package com.java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalBasic {

	
	//public static final int a;
	
	// gaurave library already added the same feature before java
	public static void main(String[] args) {

		// optional is immutuable class.
		Optional<String> opt = Optional.empty();
		System.out.println(opt);

		String test = "Nikhil";
		// if the value is non empty
		Optional nonEmptyString = Optional.of(test);

		System.out.println(nonEmptyString.get());

		String nullString = null;
		// return optional object with value if not null.Or return Optional empty object
		// if null
		Optional<String> opt2 = Optional.ofNullable(nullString);
		// get return the value of that object or nosuchelemt presetn is throw in case
		// null value or say optional empty object
		try {
			System.out.println(opt2.get());
		} catch (NoSuchElementException ex) {
			System.out.println("No element is found inside the Optional Object or null value is in Optional object");
		}
		System.out.println(nonEmptyString.isPresent());
		
		//if the opt2 is null then default will set
		String newData=opt2.orElse("Default");
		System.out.println(newData);
		// do some action if present
		nonEmptyString.ifPresent(da ->System.out.println("IS present checks"));
		//whether is present or not
		System.out.println(nonEmptyString.isPresent());
		
		
	}
}
