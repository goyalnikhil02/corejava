package threads;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {

		ATMThread t1 = new ATMThread("A");
		t1.start();
		ATMThread t2 = new ATMThread("B");
		t2.start();
		ATMThread t3 = new ATMThread("C");
		t3.start();
		ATMThread t4 = new ATMThread("D");
		t4.start();
		ATMThread t5 = new ATMThread("E");
		t5.start();
		ATMThread t6 = new ATMThread("F");
		t6.start();
	}

}
