package com.scp.doubts;

public class StringDoubt {
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		String s3 = "you can not change me";

		final String s8 = "you can not ";
		String s6 = "you can not ";

		String s7 = s6 + "change me";
		System.out.println("s7 : "+s7.hashCode());
		System.out.println("s3 : "+s3.hashCode());
		System.out.println(s7 == s3); // false

		String s9 = s8 + "change me";
		System.out.println("s9 : "+s7);
		System.out.println("s3 : "+s3);
		System.out.println(s9 == s3); // true
	}
}
