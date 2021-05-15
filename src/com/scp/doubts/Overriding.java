package com.scp.doubts;



public class Overriding {
	public static void main(String[] args) {
		X ob=new Y();
		ob.m1();
		ob.m2();
		//ob.m3();
	}
}
class X{
	public void m1(){
		System.out.println("in X cls");
	}
	public void m2(){
		System.out.println("in X cls m2()");
	}
}
class Y extends X{
	public void m1(){
		//super.m1();
		System.out.println("in Y cls");
	}
	public void m3(){
		System.out.println("in Y cls m3() ");
	}
}