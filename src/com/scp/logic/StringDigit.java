package com.scp.logic;

public class StringDigit {
	public static void main(String[] args) {
		String s1=new String("a1b2c34cd5");
		String s2="x9y87y1a";
		int sum=0;
		System.out.println(s1.hashCode());
		s1="abc";
		System.out.println(s1.hashCode());
		
		Integer i=new Integer(10);
		Integer j=new Integer(10);
		
		System.out.println(i.equals(j));
		
		System.out.println(Integer.valueOf(i).hashCode());
		i=20;
		System.out.println(i.hashCode());
		
		/*String arr[]=s1.split("");
		//System.out.println(arr.toString());
		for(int i=0;i<arr.length;i++){
			try{
			sum=sum+Integer.parseInt(arr[i]);
			}catch (NumberFormatException e) {
				// TODO: handle exception
				continue;
			}
		}
		System.out.println("Sum : "+sum);
		*/
		
		
		
		
		
		
		
		
		
		/*char []arr1=s1.toCharArray();
		for (char c : arr1) {
			if(Character.isDigit(c)){
				System.out.println(c);
				sum=sum+Character.getNumericValue(c);
			}
		}*/
		
		
		
			
		
	}
}
