package com.scp.doubts;

public class TestOverRiding {
	public static void main(String[] args) {
		A1 a=new B1();
		a.m1();
		a.m3();
		a.m4();
		
	}
}
class A1{
	void m1(){
		System.out.println("A - m1()");
	}
	void m3(){
		System.out.println("A - M3()");
	}
	void m4(){
		System.out.println("A - m4()");
	}
}
class B1 extends A1{
	/*void m4(){
		System.out.println("B - m4()");
	}*/
	void m1(){
		System.out.println("B - m1()");
	}
	void m2(){
		System.out.println("B - m2()");
	}
}