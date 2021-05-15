package com.scp.logic;

public class ReverseString {
	public static void main(String[] args) {
		String str="soundarya";
		//way1(str);
		way2(str);
	}

	private static void way2(String str) {
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}

	private static void way1(String str) {
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
	}
}
