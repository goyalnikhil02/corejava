package com.excersie;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.html.Option;

public class StreamExample {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> intArray = Arrays.asList(1, 2, 3, 4,5, 6, 7, 8);

		intArray.stream().filter(s -> s % 2 == 0).map(s -> s * 100).forEach(System.out::println);
		List <Integer> blist=intArray.stream()
				.filter(s -> s % 2 == 0)
				.collect(Collectors.toList());
 
		for (Integer integer : blist) {
			System.out.println("############"+integer);
		}
		
		int result = intArray.stream().mapToInt(i -> i).sum();
		System.out.println(result);
		
	Stream.of("a2", "a1", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max().ifPresent(System.out::println);;
	
	    Stream.of("a2", "a1", "a3")
	    .filter(s -> {
	    	System.out.println(s);
	    	return true;
	    });//.forEach(System.out::println);
	    
	    
	    Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	
	}
}
