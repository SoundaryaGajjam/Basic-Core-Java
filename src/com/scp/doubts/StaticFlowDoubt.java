package com.scp.doubts;

public class StaticFlowDoubt {

	static{
		System.out.println(" 1st static blk...");
		m1();
		
	}

	private static void m1() {
		System.out.println("in m1()....");
		System.out.println(" J : "+j);
	}
	
	static int j=20;
	
	static{
		System.out.println("2nd static blk...");
		m1();
	}
	
	public static void main(String[] args) {
		System.out.println("In main .....");
	}
	
}
