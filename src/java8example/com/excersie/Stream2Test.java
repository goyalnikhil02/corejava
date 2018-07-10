package com.excersie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2Test {
	public static void main(String[] args) {
		Map<Integer,Long> personMap;
		
		List<Person> personlist=new ArrayList<>();
		personlist.add(new Person("Nikhil", "Goel", 34));
		personlist.add(new Person("Akhil", "Goyal", 32));
		personlist.add(new Person("RAM", "Singh", 34));
		personlist.add(new Person("MRBLAH", "Aggawral", 14));
		personlist.add(new Person("MR BLAH2", "Smith", 44));
			
		
		List<Person> newpersonlist=new ArrayList<>();
		newpersonlist=personlist.stream()
				.filter(person ->person.getAge() >20)
				.collect(Collectors.toList());
				
		
		
		personMap=personlist.stream()
				.filter(person -> person.getAge()>20)
				.collect(
						Collectors.groupingBy
						(
						Person::getAge,Collectors.counting()
						)
						);
		
		 // Print the content of the hashMap
        Set<Entry<Integer, Long>> hashSet=personMap.entrySet();
        for(Entry entry:hashSet ) {

            System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
        }
		
	
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
		
		
		//char stream
		String name="Nikhil";
		IntStream  stream=name.chars();
		System.out.println(stream.distinct().count());
		
		
	}
	

}
