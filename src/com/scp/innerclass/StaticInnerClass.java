package com.scp.innerclass;

//static inner classs
class OuterClass {
	
	int i=10;
	static int j=20;
	public void m1_Outer(){
		System.out.println("inside outer cls : m1() ");
	}
	public static void m2_Outer(){
		System.out.println("Inside outer class : static m1() ");
	}
	
	
	
	static class InnerClass{
		public void m1_Inner(){
			//instatnce fields of outer cls
			OuterClass OutObj=new OuterClass();
			System.out.println(OutObj.i);
			OutObj.m1_Outer();
			
			
			//static fields of outer cls
			System.out.println(OuterClass.j);
			OuterClass.m2_Outer();
			
			
		}
	}
}
public class StaticInnerClass{
	
	public static void main(String[] args) {
		
		OuterClass o=new OuterClass();
		OuterClass.InnerClass i=new OuterClass.InnerClass();
		i.m1_Inner();
		
		
	}
}
