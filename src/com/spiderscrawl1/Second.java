package com.spiderscrawl1;

public class Second {
	
	public void show() {
		for(int i=0; i<5; i++) {
		try {
				System.out.println("I am second class performed by "+Thread.currentThread());
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}

}
