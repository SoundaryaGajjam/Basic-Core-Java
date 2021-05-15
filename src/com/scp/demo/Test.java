package com.scp.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter int value : ");
		int i=sc.nextInt();
		double d=sc.nextDouble();
		//sc.close();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter str : ");
		String str=sc1.nextLine();
		
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(d);
		

	}

}
