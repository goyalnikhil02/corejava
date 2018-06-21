package java8example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			alist.add(i);
		}
		alist.forEach(System.out::print);
		
      List<Integer> evenList=alist.stream().filter(element -> (element%2==0)).collect(Collectors.toList());
      evenList.forEach(System.out::println);
      
      List<Integer> moreList=alist.stream().filter(element -> (element==2)).collect(Collectors.toList());
      System.out.println(moreList.isEmpty());
      moreList.forEach(System.out::println);
      
	}

}
