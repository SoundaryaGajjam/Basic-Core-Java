package com.scp.doubts;

public class TestSuperNThis {
	public static void main(String[] args) {
		C111 c=new C111(10);
		c.m3();
	}
}
class A111{
	int i=0;
	public static void m2(){
		System.out.println("A- m2");
	
	}
}
class B111 extends A111{
	public  void m1(){
		System.out.println("B - m1");
		System.out.println(super.i);
	}
}
class C111 extends B111{
	C111(int i){
		super();
	}
	C111(){
		//super());
	}
	/*public void m2(){
		System.out.println("C - m2");
	}*/
	public void m3(){
		System.out.println("C -m3");
		this.m2();
		m1();
	}
	
}
