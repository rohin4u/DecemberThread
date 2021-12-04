package com.spiderscrawl.lock;

public class TestMain {

	public static void main(String[] args) throws Exception{
		
		First first = new First();
		first.start();
		
		synchronized(first) {
			
			System.out.println("Thread "+Thread.currentThread()+" the lock and says product is finished");
			Thread.sleep(2000);

			first.wait();
			System.out.println("Thread : "+Thread.currentThread()+" got notification of production");
			
		}
		
		

	}

}
