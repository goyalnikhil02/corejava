package java8example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterExample {
	
	static {
		System.out.println("loading");
	}

	// use filter findany() and orElse 
	public static void main(String[] args) {
  
		new FilterExample();
//		System.out.println(FilterExample.class.getClassLoader().getParent());
		
		try {
			Class<?> c=Class.forName("FilterExample");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong", "akhil");

		Optional<String> alist0 = lines.stream().filter(element -> element.contains("z")).findAny();

		System.out.println(alist0.isPresent());

		String alist1 = lines.stream().filter(element -> element.contains("z")).findAny().orElse("nothing");

		System.out.println(alist1);

		List<String> alist2 = lines.stream().filter(element -> element.contains("n")).collect(Collectors.toList());

		alist2.forEach(System.out::println);
	}

}
