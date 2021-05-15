package com.scp.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncDemo1 {
	public static void main(String[] args) {
		final List<String> li=new ArrayList<>();
		
		final List<String> syncList=Collections.synchronizedList(li);
		
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
				System.out.println(syncList.add(" "+i)+this.currentThread().getName()+ " -- "+i);
				}
				
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				for(int j=11;j<=15;j++){
					System.out.println(syncList.add(" "+j)+this.currentThread().getName()+ " -- "+j);
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
