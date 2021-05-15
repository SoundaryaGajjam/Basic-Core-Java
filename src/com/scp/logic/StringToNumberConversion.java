package com.scp.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToNumberConversion {
	public static void main(String[] args) throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter string : ");
		//String str=br.readLine();
		//System.out.println(str);
		String str="555";
		boolean flag=true;
		//int no=0;
		try{
		int no=Integer.parseInt(str);
		flag=true;
		}catch(NumberFormatException e){
			//e.printStackTrace();
			flag=false;
		}
		if(flag)
			System.out.println(str + " is numeric");
		else
			System.out.println(str + " is string");
		//System.out.println(no);
	}

}
