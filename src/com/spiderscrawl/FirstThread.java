package com.spiderscrawl;

public class FirstThread extends Thread{
	
	@Override
	public void run() {
		
		synchronized(this) {
			for(int i=0; i<5;i++) {
				try {
					System.out.println("Thread : "+Thread.currentThread()+" got this block");
					Thread.sleep(2000);
				}catch(Exception e) {}
			}
		}
	}

}
