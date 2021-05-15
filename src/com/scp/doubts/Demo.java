package com.scp.doubts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		Emp e1=new Emp(10, "A");
		Emp e2=new Emp(20, "B");
		Emp e3=new Emp(30, "C");
		Emp e4=new Emp(40, "C");
		Emp e5=new Emp(50, "C");
		
		List<Emp>list=new ArrayList<>();
		list.add(e5);
		list.add(e4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		Collections.sort(list,new IdBased());
		System.out.println("\nSorted : "+list);
		
	}
}

class IdBased implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getEmpId()-o2.getEmpId();
	}
	
	
}	
class PBased implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return 0;
	}
	
}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (this.empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}*/
	
//}
class Emp {//implements Comparator<Emp>{
	private int empId;
	private String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "\nEmp [empId=" + empId + ", empName=" + empName + "]";
	}
}
	/*@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.empId-o2.empId;
	}*/
	


