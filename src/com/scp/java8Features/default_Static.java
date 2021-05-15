package com.scp.java8Features;

import java.util.Comparator;

@FunctionalInterface
interface interface1{
	void m1();
	default void m2(){
		System.out.println("interface 1 : m2()");
	}
	
	static void m3(){
		System.out.println("interface 1 : m3()");
	}
	
}
interface interface2{
	void m1();
	default void m2(){
		System.out.println("interface 2 : m2()");
	}
	

	
}
class Demo implements interface1,interface2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 : m1()");
	}

	/*@Override
	public void m1() {
		
		System.out.println("interface 2 : m11()");
	}*/

	@Override
	public void m2() {
		
		interface1.super.m2();
		System.out.println("hiii");
	}
	
}
public class default_Static{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		//d.m11();
		d.m2();
		
	}

	
}
