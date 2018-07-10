package com.excersie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;
public class StreamFromFile {
	
	//https://www.youtube.com/watch?v=fabN6HNZ2qY

	public static void main(String[] args) throws IOException {
		 
		Function<String,Stream<String>> splitWords = line -> Pattern.compile(" ").splitAsStream(line);
		Stream<String> lines = Files.lines(Paths.get("E://BackUP//PraticeCode//JAVA8DEMOS//src//test.txt"));
	    Stream<String> words= lines.flatMap(splitWords);
	    //System.out.println(words.toArray().length);	
		
    
	    long count=words.map(word ->word.toLowerCase()).distinct().count();
	    System.out.println(count);
    
    
	}

	

	

}
