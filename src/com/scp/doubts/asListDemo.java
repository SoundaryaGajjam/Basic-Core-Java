package com.scp.doubts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asListDemo {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		//List<Integer> nums=new ArrayList<>(Arrays.asList(10,20,30));
		//Integer []arr={10,20,30};
		nums=Arrays.asList(10,20,30);
		System.out.println("Before : "+nums);
		nums.set(0, 50);
		System.out.println("Setting at 0th location : "+nums);
		nums.add(40);
		System.out.println(nums.size());
		System.out.println("After : "+nums);
		
	}

}
