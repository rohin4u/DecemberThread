package com.spiderscrawl1;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Display d = new Display();
		FirstThread t1 = new FirstThread(d, "Delhi");
	
		t1.start();
		
		synchronized(d) {

			d.wish("Mumbai");
			}
		
	}
}
