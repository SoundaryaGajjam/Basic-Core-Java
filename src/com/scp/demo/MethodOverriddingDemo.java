package com.scp.demo;
class Parent{
	static String nm="apple";
	public static void m1(){
		System.out.println(nm);
	}
	
}
class Child extends Parent{
	static String nm="mango";
	public static void m1(){
		System.out.println(nm);
	}
	
}
public class MethodOverriddingDemo {
	
	public static void main(String[] args) {
		Parent a=new Parent();
		a.m1();
		System.out.println("Main : "+a.nm);
	}

}
