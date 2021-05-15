package com.scp.demo;

class P
{
	static int cnt1;
	int i;
	static{
		System.out.println("Satic block : P");
	}
	
	{
		System.out.println("Instatnce Block : P");
	}

	public P() {
		System.out.println("Constructor : P");
		cnt1++;
		i=10;
		System.out.println("scnt : "+cnt1);
		System.out.println("i : "+i);
		
	}
	
}
class Chld extends P{
	int j;
	static{
		System.out.println("Static block : C");
	}
	
	{
		System.out.println("Instance Block : C");
	}
	public Chld(){
		System.out.println("Constructor : C");
		System.out.println("J : "+(j+1));
	}
	
}
public class BlocksConstructorDemo {
	public static void main(String[] args) {
		Chld c=new Chld();
		Chld c1=new Chld();
		
		
		
	
}
}
