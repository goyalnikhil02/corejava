package com.lamda;

public class TypeInferenceExample {

	public static void main(String[] args) {

	/*StringLengthLambda obj=(String str) ->str.length();
	
	obj.lengthOFString("Nikhil");*/
		
		// StringLengthLambda data=word -> word.length();
		// System.out.println(data.lengthOFString("nikhil"));
		
		print(s -> s.substring(0, 3)); //mnow we are passing the action not the variable
	}

	public static void print(StringLengthLambda data) {
		System.out.println(data.lengthOFString("nikhil"));
	}

	interface StringLengthLambda {
		String lengthOFString(String a);
	}

}
