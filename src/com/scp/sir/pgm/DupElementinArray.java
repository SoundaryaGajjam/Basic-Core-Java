package com.scp.sir.pgm;

public class DupElementinArray {

	public static void main(String[] args) {
		int []arr=new int[6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=10;
		arr[3]=10;
		arr[4]=20;
		arr[5]=10;
		int cnt=1;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					cnt++;
				}
				
				System.out.println(arr[i] +" is repeated :"+cnt+" time" );
				cnt=1;
			}
		}
	}
}
