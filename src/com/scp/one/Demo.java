package com.scp.one;

public class Demo {
	static int svar=20;
	int ivar=30;
	
	static {
		System.out.println("In static blk 1 ");
	}
	{
		System.out.println("In instatnce blk 1");
	}
	
	Demo(){
		this(1000);
		System.out.println("In default constructor");
	}
	public void show(){
		System.out.println("in show ");
	}
	
	public static int add(){
		return 10+20;
	}
	Demo(int i){
		//this();
		System.out.println("In Para constructor");
	}
	static {
		System.out.println("In static blk 2 ");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Demo d=new Demo();
		d.show();
		//int s=Demo.add();
		System.out.println(Demo.add());
		System.out.println("main completed");
	}

}
