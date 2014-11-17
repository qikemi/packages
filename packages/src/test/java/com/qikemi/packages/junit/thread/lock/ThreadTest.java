package com.qikemi.packages.junit.thread.lock;

public class ThreadTest extends Thread {
	private int threadNo;
	private static Object lock = new Object();

	public ThreadTest(int threadNo) {
		this.threadNo = threadNo;
	}

	public void run() {
		synchronized (lock) {
			for (int i = 1; i < 20; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("No." + threadNo + ":" + i);
			}
		}
	}
}