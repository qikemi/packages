package com.qikemi.packages.junit.thread.lock;

public class MainLock {

	public static void main(String[] args) throws Exception {
		for (int i = 1; i < 5; i++) {
			Thread.sleep(100);
			new ThreadTest(i).start();
			Thread.sleep(1);
		}
	}

}