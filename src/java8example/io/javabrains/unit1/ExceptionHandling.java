package io.javabrains.unit1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandling {

	public static void main(String[] args) {
	int [] array={1,2,3,4,5};
	int key=2;
	process(array,key,(a,b) -> System.out.println(a/b));
	}

	private static void process(int[] array, int key,BiConsumer<Integer,Integer> consumer) {
		for(int a: array)
		{
			
			consumer.accept(a, key);
		}
		
	}

}
