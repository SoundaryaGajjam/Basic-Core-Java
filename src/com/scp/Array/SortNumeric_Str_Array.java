package com.scp.Array;

import java.io.*;
import java.util.Arrays;

public class SortNumeric_Str_Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
		int []num=new int[n];
		System.out.println("Enter the elements into array");
		for(int i=0;i<n;i++)
			num[i]=Integer.parseInt(br.readLine());
		System.out.println("Sorted numbers....");
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		String []str=new String[n];
		System.out.println("Enter the string  elements into array");
		for(int i=0;i<n;i++)
			str[i]=br.readLine();
		System.out.println("Sorted String....");
		Arrays.sort(str);
		//System.out.println(str);
		System.out.println(Arrays.toString(str));
	}
	
}
