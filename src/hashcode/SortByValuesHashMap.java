package hashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortByValuesHashMap {
	public static void main(String[] args) {
		Employee e1=new Employee(2, "A", 20.3f);
		Employee e2=new Employee(22, "X", 25.3f);
		Employee e3=new Employee(15, "h", 15.3f);
		Employee e4=new Employee(8, "P", 99.3f);
		Employee e5=new Employee(1, "b", 30.3f);
		
		HashMap<String,Employee> hmap=new HashMap<>();
		hmap.put("Emp1", e1);
		hmap.put("Emp2", e2);
		hmap.put("Emp3", e3);
		hmap.put("Emp4", e4);
		hmap.put("Emp5", e5);
		
		//System.out.println(hmap);
		sortByUDValue(hmap);
		
		/*HashMap hmap=new HashMap<>();
		hmap.put("A",22);
		hmap.put("X",2);
		hmap.put("G",15);
		hmap.put("D",8);
		hmap.put("C",1);*/
		
		//System.out.println(hmap);
		
		//sortByVal(hmap);
	}

	private static void sortByUDValue(HashMap<String, Employee> hmap) {
		List<Entry<String, Employee>>list=new ArrayList<>(hmap.entrySet());
		System.out.println(list);
		Collections.sort(list,new SortById());
		
		/*Collections.sort(list,new Comparator<Entry<String, Employee>>() {

			@Override
			public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
				//return o1.getValue().getEmpId()-o2.getValue().getEmpId();
				return o1.getValue().empName.compareTo(o2.getValue().empName);
			}
		});*/
		System.out.println(list);
	}

	private static void sortByVal(HashMap hmap) {
		List<Entry<String,Integer>> listOfEntries=new ArrayList<>(hmap.entrySet());
		
		System.out.println(listOfEntries);
		Collections.sort(listOfEntries,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		System.out.println(listOfEntries);
		
	}
}


class Employee{
	int empId;
	String empName;
	float empSal;
	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}

class SortById implements Comparator<Entry<String, Employee>>{

	@Override
	public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
		// TODO Auto-generated method stub
		 return o1.getValue().empName.compareTo(o2.getValue().empName);
	}

	
	
}