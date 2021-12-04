package com.spiderscrawl.lock;

public class First extends Thread{
	
	public void run() {
		this.setName("First Thread");
		synchronized(this) {
			try {
			System.out.println(Thread.currentThread()+" got the request of main or consumer");
			Thread.sleep(2000);
			System.out.println("Thread "+Thread.currentThread()+"Notified child thread");
			this.notify();
			}
			
			catch(Exception e) {}
			
		}
		
	}

}
