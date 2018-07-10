package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.unit1.Unit1Exercise.Condition;



public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

				
		Collections.sort(people, (  p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		

		printConditionally(people,p -> true,(p) -> System.out.println(p));
		
		
		System.out.println(">>>>>>>>>First Name>>>>>>>>>>>>>");
		printConditionally(people, (p) ->  p.getFirstName().startsWith("C"),(p) -> System.out.println(p.getFirstName()) );

		System.out.println(">>>>>>>>>Last Name>>>>>>>>>>>>");
		printConditionally(people, (p) ->  p.getLastName().startsWith("C") ,(p) -> System.out.println(p.getLastName()));
		
		
	}


	public static void printConditionally(List<Person> people, Predicate<Person> pre,Consumer<Person> consumer) {
		for (Person p : people) {
			if (pre.test(p)) {
				consumer.accept(p);
			}

		}
	}



}
