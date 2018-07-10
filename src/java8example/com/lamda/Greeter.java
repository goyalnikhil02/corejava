package com.lamda;

public class Greeter implements Greet {

	@Override
	public void perform() {
		System.out.println("Greeting");
	}
	//lambda= () -> System.out.println("Greeting");
	//doubleNumberFunction=(int a) ->  a*2;
	//addTwoNumbers=(int a, int b) -> a+b;
	/*divideTwoNumber=(int a ,int b) -> {
		if(b==0) return 0;
		return a/b;
	};*/


	
	// 	stringLEngthCount= (String word) -> word.length();
}
