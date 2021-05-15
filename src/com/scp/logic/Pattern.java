package com.scp.logic;

public class Pattern {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++){
			for(int j=0;j<=i;j++){
				if(i==j)
					System.out.print(" 1");
				else if(i%2==0 && j%2==0)
					System.out.print(" 1");
				else if(i%2==1 && j%2==1)
					System.out.print(" 1");
				else 
					System.out.print(" 0");
			}
			System.out.println("\n");
		}
	}
}
