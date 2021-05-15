package com.scp.logic;

import java.util.Arrays;

public class MatrixAntiClockwise {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int  b[][]=new int[3][3];
		int k=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=k++;
			}
		}
		/*for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}*/
		int x=2;
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				b[i][j]=a[j][x];
			}
			x--;
			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("\t"+b[i][j]);
			}
			System.out.println();
		}
	}
	
}
