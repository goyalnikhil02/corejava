package com.lamda;

public class LambdaTest {

	public void hello() {
		System.out.println("Hello Simple");
	}
	// convert above to lambda expression

	// LamdaRef aSimple=() -> System.out.println("Hello");

	/*
	 * public double add(int number) { return number * 2; }
	 * 
	 * // lambda expr aVar=(
	 * 
	 * int a)->a*a;}
	 * 
	 * addMethod=(int a,int b)-> a+b;
	 * 
	 * safeDivide=(int a ,int b) -> { if(b==0) { return 0; } else { return a/b; } };
	 */
	public static void main(String[] args) {
		LambdaTest helloObj = new LambdaTest();
		helloObj.hello();

		LamdaRef aSimple = () -> System.out.println("Hello Lambda");
		aSimple.test();

		LamdaRef inner = new LamdaRef() {

			@Override
			public void test() {
				System.out.println("Hello Inner");

			}

		};
		inner.test();
	}

	// this method can only have one and only one method: functional Interface
	public interface LamdaRef {
		void test();

	}

	/*public interface AnonymousInner {
		void test();

	}*/

}
