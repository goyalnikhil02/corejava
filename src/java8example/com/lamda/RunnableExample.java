package com.lamda;

public class RunnableExample {

	public static void main(String[] args) {
/*		Thread mythread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("IN THREAD");
			}
		});
		mythread.run();*/
		Thread mythread2 = new Thread(() -> {
			for(int i=0;i<5;i++)
			System.out.println("IN Lambda THREAD");
		System.out.println("IN Lambda ");
		});
		mythread2.run();
	}

	
}
