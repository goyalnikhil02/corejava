package imutuableclass;

import java.util.ArrayList;
import java.util.List;



public class FinalTest {
	
	final  List foo;
	
	public FinalTest() {
		 foo = new ArrayList();
	      foo.add("foo"); // Modification-1
	}

	public static void main(String[] args) {
      FinalTest finalObj=new FinalTest();
      finalObj.foo.add("Nikhil");
      System.out.println(finalObj.foo.size());

		 

	}

}
