package com.scp.demo;

class Super{
	
}
class Sub extends Super{
	
}
public class TightlyEncapsulatedDemo {
	public static void main(String[] args) {
		Super x=null;
		Sub y=null;
		y=(Sub)x;
		
		int []a=new int[5];
		//a[0]=10;
		a[-1]=20;
		
		
		/*int []arr=new int[]{1,2,3,4};
		int []b=arr;
		for(int x:b)
			System.out.println(x);
		b[2]=55;
		for(int x:arr)
			System.out.println(x);*/
		
		int []arr=new int[]{1,2,3,4};
		System.out.println(arr[1]);
		
		double d=100.54;
		//float f=d;
		//System.out.println(f);
		
		int []arrr=new int[0];
		//arrr[0]=10;
		System.out.println(arrr[0]);
		
		char c='f';
		
		
		
	}

}
