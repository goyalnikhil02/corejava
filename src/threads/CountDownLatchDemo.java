package threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);
		Thread appThread = new Thread(new Service("Apps", 100, latch));
		Thread gamesThread = new Thread(new Service("Games", 100, latch));
		Thread youtubeThread = new Thread(new Service("Youtube", 100, latch));
		appThread.start();
		gamesThread.start();
		youtubeThread.start();

		try {
			System.out.println("Current thread Count:"+latch.getCount());
			latch.await();// will wait till all thread Complete their work.Or say latch count =0 comes.			
			System.out.println("All service are up now.Proceed to Bussiness logic now");
			System.out.println("Left thread Count:"+latch.getCount());
		} catch (InterruptedException e) {
			System.out.println("Exceptipon Occurs");
		}
	}
}
