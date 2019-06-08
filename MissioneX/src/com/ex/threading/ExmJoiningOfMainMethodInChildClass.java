package com.ex.threading;

public class ExmJoiningOfMainMethodInChildClass {

	public static void main(String[] args) throws InterruptedException {
		
		JoiningOfMainMethodInChildClass.mainThread = Thread.currentThread();
		
		JoiningOfMainMethodInChildClass t = new JoiningOfMainMethodInChildClass();
		
		t.start();
		for(int i = 1; i<5;i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}

class JoiningOfMainMethodInChildClass extends Thread {
	static Thread mainThread;

	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}
