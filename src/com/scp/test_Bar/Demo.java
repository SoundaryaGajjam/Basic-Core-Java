package com.scp.test_Bar;

public class Demo {
	public static void main(String[] args) {
		Integer i=0;
		Integer j=0;
		for(Short z=0;z<5;z++)
			if((++i>3)||(++j>3))
				i++;
		System.out.println(i
				);
	}
}
