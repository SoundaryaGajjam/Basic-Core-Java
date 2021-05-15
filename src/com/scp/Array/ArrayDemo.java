package com.scp.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//convert array to list
		String []str={"Blue","White","Red","Yellow"};
		List<String>list=new ArrayList<>(Arrays.asList(str));
		System.out.println(list);
		
		//search array element by binary search
		char []ch={'a','b','c','d','e','f','g'};
		int index=Arrays.binarySearch(ch, 0,ch.length,'d');
		System.out.println(index);
		
	}

}
