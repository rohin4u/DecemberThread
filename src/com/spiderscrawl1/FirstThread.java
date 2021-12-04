package com.spiderscrawl1;

public class FirstThread extends Thread{
	
	Display d;
	String name;
	Second second = new Second();
	public FirstThread(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		this.setName("First Thread");
		synchronized(d) {
			
			d.wish(name);
		
			}
		synchronized (second) {
			second.show();
			
			}
		}
}
