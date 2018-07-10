package io.javabrains.unit1;

public class ThisReferenceExample {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	public void execute()
	{
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this); 
		});
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		 
		/*thisReferenceExample.doProcess(10,(i)->{
			System.out.println("value of  i:"+i);
		//	System.out.println(this);
			
		});*/
		thisReferenceExample.execute();
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Objet of outer class";
	}
}
