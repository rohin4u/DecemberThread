package com.spiderscrawl;

public class Test {
	
	// If synchornized block is available inside thread class so that
	//Threat class is owner of that synchronized block

	public static void main(String[] args)throws Exception {
		
		FirstThread first = new FirstThread();
		first.setName("First Thread");
		first.start();
		
		synchronized(Thread.currentThread()) {
			for(int i=0; i<5; i++) {
			
			System.out.println("Thread : "+Thread.currentThread()+" is executing");
			Thread.sleep(2000);
			}
			
		}
	}
}
