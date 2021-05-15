package com.scp.doubts;
//Annonymous interface implementation 

abstract class A {
	abstract void m1();
}

public class AnnoynomousInterface {

	public static void main(String[] args) {
		A obj = new A() {

			@Override
			public void m1() {
				System.out.println("Hiiii");

			}
		};

		obj.m1();
	}
}
