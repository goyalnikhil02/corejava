package imutuableclass;

import java.util.Date;

public class TestImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass obj=ImmutableClass.getImumutableObj("Nikhil",12, new Date(2));
		doModification(obj.name,obj.rollno,obj.date);
		
		/*obj.name="ASKil";
		obj.rollno=111;
		obj.date=new Date(2);
		*/
		System.out.println(obj);
		System.out.println(obj);

	}

	private static void doModification(String name, int rollno, Date date) {
		// TODO Auto-generated method stub
		name="Akhil";
		rollno=111;
		date.setDate(2);;
		
	}

}
