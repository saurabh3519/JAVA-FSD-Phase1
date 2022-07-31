package com.simplilearn.multithreading;

public class ThreadDemo2 {
	
	//implement run method
	
		public  void run() {
			
			for(int i=1; i<5; i++) {
				
				System.out.println(i+ " "+Thread.currentThread().getName());
			
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//1000milliseconds=1second
				
			}
			

}
