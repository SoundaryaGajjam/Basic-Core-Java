package com.scp.demo;
class Animal{
	 static String name="animal";
	String makeNoise(){
		return "genric noise";
	}
}
class Dog extends Animal{
	static String name="dog";
	  String makeNoise(){
		return "barkkkk";
	}
}
public class VarMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		System.out.println(a.name+" "+a.makeNoise());
	}

}
