package com.scp.demo;

public class DataTypeDemo {
	public static void main(String[] args) {
		//Program 2
		
		Double d=new Double("2.4");
		int a=d.intValue();
		byte b=d.byteValue();
		float c=d.floatValue();
		double dd=d.doubleValue();
		
		System.out.println(a+b+c+dd);
		/*
		 * 
		 * o/p
		 * 8.800000095367432
		 * 
		 * 
		 * 
		 * Arithmetic conversions are implicitly performed to cast the values to a common type.
		 *  The compiler first performs integer promotion. 
		 *  If the operands still have different types, then they are converted to the 
		 *  type that appears highest in the hierarchy.
		 * 
		 */
		
	}
	
	
}
//Program 1


	/*int obntMarks;
	double avg;
	int TOTAL=600;
	public DataTypeDemo(int obntMarks) {
		this.obntMarks=obntMarks;
		calculate(obntMarks);
	}
	public void calculate( int obntMarks){
		//double sum = obntMarks*100;
		//avg=sum/TOTAL;
		avg=obntMarks*100/TOTAL;
		System.out.println(avg);
		
	}
	public static void main(String[] args) {
		DataTypeDemo d=new DataTypeDemo(426);
		
	}

}
*/