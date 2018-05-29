package com.java8;

public class LargestNumber {
	public static void main(String[] args) {
		int array[]= {10,110,210,-1};
		
		findLargest(array);
	}

	private static void findLargest(int[] array) {
		int maxnumber=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(maxnumber<array[i])
			{
				maxnumber=array[i];
			}
		}
		
		
		System.out.println(maxnumber);
	}

}
