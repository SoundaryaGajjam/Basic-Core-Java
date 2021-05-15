package com.scp.test_Bar;

import java.io.IOException;

class A{
	public int getResult(int a,int b)throws IOException{
		return 0;
	}
}
class B extends A{
	public int getResult(int a,int b)throws ArithmeticException{
		//int z=10/0;
		return 1;
	}
}
public class Test2 {
	public static void main(String[] args) throws IOException {
		A a=new B();
		System.out.println(a.getResult(10, 20));
	}
}
