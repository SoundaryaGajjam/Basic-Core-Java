package com.scp.logic;
import java.util.*;
public class DecimalToBinary {

	public void printBinaryFormat(int no){
		int arr[]=new int[20];
		int i=0;
		while(no>0){
			arr[i++]=no%2;
			no=no/2;
		}
		System.out.println("Binary no is : ");
		for(i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dcimal no : ");
		int no=sc.nextInt();
		
		
		DecimalToBinary obj=new DecimalToBinary();
		obj.printBinaryFormat(no);
		
		

	}

}
