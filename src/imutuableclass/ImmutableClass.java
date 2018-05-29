package imutuableclass;

import java.util.Date;

// cannot be subclass
public final class ImmutableClass {
	// state cannot be changes after object creation
	final String name;
	final int rollno;
	final Date date;
	
	//object of this class will created through only one method that will be exposed
	private ImmutableClass(String name, int rollno, Date date) {
		this.name = name;
		this.rollno = rollno;
		this.date = new Date(date.getTime());
	}
	//object creation will now in a single place,now we can make the constructor private
	public static ImmutableClass getImumutableObj(String name, int rollno, Date dates)
	{
		return new ImmutableClass(name, rollno, dates);
	}
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public Date getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", rollno=" + rollno + ", date=" + date + "]";
	}
	
	
	
 
}
