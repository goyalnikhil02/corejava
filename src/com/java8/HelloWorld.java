package com.java8;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");

		
		TT t=new TT(12,"Hello");
		System.out.println(t.a+":"+t.b);
		
		CopyOnWriteArrayList list=new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			list.add(3);
			itr.next();
		}
		System.out.println(list);
	}
	
	
	

}
