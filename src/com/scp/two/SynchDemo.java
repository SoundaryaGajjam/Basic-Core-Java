package com.scp.two;

public class SynchDemo {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		t2.start();
		
	}
	
	//public synchronized void m1(){
	
	public  void m1(){
		System.out.println("thread in side m1"+Thread.currentThread().getName() );
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++){
			System.out.println("  m1 :  "+Thread.currentThread().getName()+" -- "+i);
		}
		
		}
}

class MyThread extends Thread{
	static SynchDemo d=new SynchDemo();
	
	public void run(){
		
		/*for(int x=0;x<5;x++)
			System.out.println("A : "+x);*/
		//synchronized (this) {
			/*for(int x=0;x<5;x++)
				System.out.println(" synch "+this.currentThread().getName()+" -- "+x);*/
		synchronized(d)
		{
			d.m1();
		}
		//d.m1();
		//}
		
	/*	for(int x=0;x<5;x++)
			System.out.println(" B : "+x);
		
	}*/
}
}

