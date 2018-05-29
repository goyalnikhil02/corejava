package com.java8;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

public static Comparator<Student> nameSort=new Comparator<Student>() {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
};
	
	
	public static Comparator<Student> RollNosort= new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.rollno-o2.rollno;
		}
		
		
	};
public static void main(String[] args) {
	Student s1=new Student("nikhil", 11);
	Student s2=new Student("nikhil", 11);
	Student s3=new Student("abkhil", 10);
	Student[] array=new Student[3];
	array[0]=s1;
	array[1]=s2;
	array[2]=s3;
	
	
	Book b1=new Book(12,"Hitler");
	
	Book b2=new Book(10,"Hitler");
	
	Book b3=new Book(11,"Hitler Again ");
	Book[] bkarr=new Book[3];
	bkarr[0]=b1;
	bkarr[1]=b2;
	bkarr[2]=b3;
	
	
	
	Arrays.sort(bkarr);

	for(Book bk:bkarr)
	{
		System.out.println(bk);
	}
	
	
	
	
//Arrays.sort(array, nameSort);
Arrays.sort(array, RollNosort);	
	
for(Student s:array)
System.out.println(s);
}
}
