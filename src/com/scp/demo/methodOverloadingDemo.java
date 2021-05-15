package com.scp.demo;

public class methodOverloadingDemo {
	public static void m1(Object o){
		System.out.println("Object");
	
	}
	
	public static void m1(Integer i){
		System.out.println("Integer");
	}
	
	/*public static void m1(String s){
		System.out.println("string");
	}*/
	public static void main(String[] args) {
		m1(null);
	}

}
