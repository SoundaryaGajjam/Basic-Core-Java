package com.scp.demo;

public class StringConstantPoolDemo {
	public static void main(String[] args) {
		String str="Java";
		String str1=new String("Java");
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str.compareTo(str1));
	}

}
