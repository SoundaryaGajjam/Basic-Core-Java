package com.scp.demo;

public class Demo {

	
	public static void main(String[] args) {
		/*int i=426;
		int j=600;
		double k=0;
		k = (double)i/j;
		System.out.println(k);*/
		E e=new E();
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println(e.toString());
		
	}

}
class E{
	private int empId;
	private String empName;
}