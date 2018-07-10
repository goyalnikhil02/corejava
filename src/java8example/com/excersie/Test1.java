package com.excersie;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {

public static void main(String[] args) {
		
		Scanner i = new Scanner (System.in);
		
		System.out.println("Enter String date to be converted into 12-hour format");
		String inputdate = i.nextLine();
              i.close();
				DateFormat d = new SimpleDateFormat("hh:mm:ss aa");

				DateFormat o = new SimpleDateFormat("HH:mm:ss");
				Date date = null;
				try {

					date = d.parse(inputdate);

					String outputdate = o.format(date);

					System.out.println("Date in 24-hour format:"+outputdate);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
}
}