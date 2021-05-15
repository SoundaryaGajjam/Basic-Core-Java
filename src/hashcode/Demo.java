package hashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
	public static void main(String[] args) {
		
		Student s1=new Student(10, "A");
		Student s2=new Student(14, "Z");
		Student s3=new Student(1, "b");
		Student s4=new Student(11, "z");
		List list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//Collections.sort(list,null);
		
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()){
			//list.add(s4);
			//list.remove(s2);
			
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(list);
		
		ConcurrentHashMap<Integer, String>map=new ConcurrentHashMap<>();
		map.put(10, "Ten");
		map.put(2, "Two");
		System.out.println("Map contents : ");
		System.out.println(map);
		Iterator  itr1=map.keySet().iterator();
		while(itr1.hasNext()){
			//map.put(3, "Three");
			map.remove(2);
			System.out.println(itr1.next());
		}
		System.out.println(map);
	}
}
class Student{// implements Comparable<Student>{
	private int studId;
	private String studName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	/*@Override
	public int compareTo(Student o) {
        System.out.println("in compare tooo");
		return this.studId-o.studId;
	}
*/
	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + "]";
	}
	
	
}
class NameBasedSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("in compare  ");
		return o1.getStudName().compareTo(o2.getStudName()) ;
	}
	
}