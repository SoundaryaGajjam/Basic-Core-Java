package com.scp.doubts;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class KillDemo {
	public static void main(String[] args) throws InterruptedException {
		KillThreadDemo t1 = new KillThreadDemo("t1");
		KillThreadDemo t2= new KillThreadDemo("t2");
		t1.start();
		//t1.killThread();
		t2.start();
		t1.join();
		//t1.killThread();
		
		System.out.println("Completed Thread name  -- "+Thread.currentThread().getName());
	}

}
class KillThreadDemo extends Thread{ 
	volatile boolean flag=true;
	volatile int count =0;
	public void killThread(){
		flag=false;
		System.out.println("Killing --" + Thread.currentThread().getName());
	}
	public KillThreadDemo(String name) {
		super(name);
	}
	public void run(){
			while(flag ){
				System.out.println("Count value -- "+count);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(Thread.currentThread().getName().equals("t1")){
					if(count>=10){
						killThread();
					}
				}
				
				
				
				count++;
				System.out.println(Thread.currentThread().getName() +" -- Running --"+ThreadLocalRandom.current().nextInt());
			}
			System.out.println("Terminating the thread" +Thread.currentThread().getName());
	}
}


