package com.scp.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		List list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			list.add(i);
		
		//list.forEach(System.out::println);
		
		//list.forEach(item->System.out.println(item));
		
		//list.forEach((x)->System.out.println(x));
		
		/*list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});*/
		
		MyConsumer m=new MyConsumer();
		list.forEach(m);
	}
}
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}