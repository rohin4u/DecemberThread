package com.spiderscrawl1;

public class Display
{
	
	
	public void wish(String name) {
		synchronized(this) {
			System.out.println(Thread.currentThread()+" is performing");
			for(int i=0; i<5; i++) {
			try {
				System.out.print("Good Morning :");
				Thread.sleep(2000);
			}catch(Exception e) {}
				System.out.println(name);
			}
		
		}
	}
	
}
