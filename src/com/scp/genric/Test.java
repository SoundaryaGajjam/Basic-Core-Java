package com.scp.genric;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[]args)
	{
		List<Animal>list=new ArrayList<>();
		List<Dog>dlist=new ArrayList<>(); 
		list.add(new Cat());
		list.add(new Dog());
		Animal []a=new Animal[10];
		Dog []d=new Dog[5];
		m1(d);
		m3(list);
		m2(dlist);
		//<? extends Animal>
	}
	static void m1(Animal []a)
	{
		a[0]=new Cat();
	}
	static void m3(List<Animal>list)
	{
		list.add(new Cat() );
	}
	static void m2(List<? extends Animal>list)
	{
		//list.add(new Animal());
		//System.out.println(list.get(0));
		//list.add(10);
		//list.add(new Dog());
	}
}
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
	
}