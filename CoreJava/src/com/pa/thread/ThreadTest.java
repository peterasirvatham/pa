package com.pa.thread;

class ThreadDemo extends Thread {
	// private Thread t;
	private String threadName;

	ThreadDemo(String name) {
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

	/*
	 * public void start () { System.out.println("Starting " + threadName );
	 * super.start(); }
	 */
}

public class ThreadTest {

	public static void main(String args[]) {
		ThreadDemo T1 = new ThreadDemo("Thread-1");
		T1.getPriority();
		T1.start();

		ThreadDemo T2 = new ThreadDemo("Thread-2");
		T2.start();
	}
}