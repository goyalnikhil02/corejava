package com.excersie;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class SolutionwithJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step 1: Sort list by last name

		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list
		printAll(people);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

		// Step 3: Create a method that prints all people that have last name
		// beginning with C
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

		// Step 4: Create a method that prints all people that have first name
		// beginning with C

		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	public static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}

		}
	}

	interface Condition {
		boolean test(Person p);
	}

}
