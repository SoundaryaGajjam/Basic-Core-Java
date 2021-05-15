package com.scp.Array;

public class TestArray {
	public static void main(String[] args) throws Throwable {
		int []num=new int[5];
		//num.
		Emp []arr=new Emp[5];
		arr=null;
		arr[0].finalize();
		Emp e=new Emp();
		e.finalize();
		
	}

}
class Emp{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nEmp [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}