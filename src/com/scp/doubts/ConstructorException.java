package com.scp.doubts;

public class ConstructorException  {
public static void main(String[] args) throws Exception   {
	//ConstructorException obj=new ConstructorException();
	D d=new D();
}

public ConstructorException()  {
	super();
	//int a=10/0;
	// TODO Auto-generated constructor stub
}
}
class A11 {

	public A11() throws Exception{
		super();
		String str=null;
		int len=str.length();
		// TODO Auto-generated constructor stub
	}
	
}
class D extends A11{

	public D() throws Exception{
		super();
		//int a=10/0;
		// TODO Auto-generated constructor stub
	}
	
}