package com.scp.doubts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDoubt_Ninad_Q {

	static List<Employee>listOfEmps=new ArrayList<>();
	public static void main(String[] args) {
		
		Employee e1=new Employee(10, "Tanu", "Pune");
		Employee e2=new Employee(11, "Sou", "Mumbai");
		Employee e3=new Employee(12, "Ninad", "Delhi");
		Employee e4=new Employee(13, "Tanu", "Pune");
		listOfEmps.add(e1);
		listOfEmps.add(e2);
		listOfEmps.add(e3);
		listOfEmps.add(e4);
		Employee obj=getEmp("Tanu", "Pune");
		System.out.println(obj);
			
		}
		
		
	
	public static Employee getEmp(String name,String city)
	{
		
		System.out.println();
		HashMap<Employee,Employee>hmap=new HashMap<>();
		
		for (Employee employee : listOfEmps) {
			Employee se1=new Employee(employee.empName,employee.address);
			hmap.put(se1,employee);
			
		}
		
		System.out.println(hmap);
		
		
		
		
		
		return hmap.get(new Employee(name, city));
		
	}
}
class Employee{
	int empId;
	String empName;
	String address;
	public Employee(int empId, String empName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public Employee(String empName, String address) {
		super();
		//this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
}