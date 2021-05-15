package com.scp.demo;
interface interface_name{
	
}
public class InterfaceDemo implements interface_name{
	public static void main(String[] args) {
		interface_name a=new InterfaceDemo();
		System.out.println(a.equals(null));
		System.out.println(a.toString());
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
	}

}
