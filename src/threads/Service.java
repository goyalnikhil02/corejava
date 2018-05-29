package threads;

import java.util.concurrent.CountDownLatch;

public class Service  implements Runnable{
	private final String name;
    private final int timeToStart;
    private final CountDownLatch latch;


	public Service(String name, int timeToStart, CountDownLatch latch) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}


	@Override
	public void run() {
     try {
		Thread.sleep(timeToStart*100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();	}
		System.out.println("Inside service "+name+"."+name +"service is up now");
		latch.countDown();//Complete the thread Work and reduce the count by 1
		
     
	}

}
