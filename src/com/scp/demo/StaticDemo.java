package com.scp.demo;
class Super1{
	static int i;
	static{
		System.out.println("inside super1 static block ");
		i=20;
	}
}
public class StaticDemo{
	static{
		System.out.println("inside statictdemo static block");
	}
	public static void main(String[] args) {
		System.out.println("3");
		System.out.println(Super1.i);
	}

}
