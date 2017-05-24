package com.pa.thread;

class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

}

public class RunnableTest {

	public static void main(String args[]) throws InterruptedException {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		Thread t = new Thread(R1);
		t.start();
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		Thread t2 = new Thread(R2);
		t2.start();
		//t.join();
		//t2.join();
		System.out.println("sdfsdfff");
	}
}
