package com.scp.doubts;

//factory design pattern with serialization

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FactoryPatternWithSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person pOb1=PersonFactory.getInstance(type.teacher);
		//System.out.println(pOb1);
		
		Person pOb2=PersonFactory.getInstance(type.student);
		
		File file=new File("DesignPatterSerialization.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(pOb1);
		oos.writeObject(pOb2);
		System.out.println("Serialization completed....");
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person deSerialObj1=(Person) ois.readObject();
		System.out.println(deSerialObj1);
		
		Person deSerialObj2=(Person) ois.readObject();
		System.out.println(deSerialObj2);
		
		System.out.println("Deserialization Completed....");
		
	}
}
enum type{
	student,
	teacher;
}
class PersonFactory{
	public static Person getInstance(type t){
		if(type.student.equals(t))
			return new Student();
		else if(type.teacher.equals(t))
			return new Teacher();
		return null;
		
	}
	
}
abstract class Person implements Serializable{
	private String Name;
	private long mobNo;
	private Date DOB;
	private Address address;
	Date date=new Date();
	abstract String getName();
	abstract long mobNo();
	abstract SimpleDateFormat DOB();
	abstract Address getaddress();
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", mobNo=" + mobNo + ", DOB=" + DOB.toString() + ", address=" + address + "]";
	}
	
	
}

class Student extends Person{
	@Override
	String getName() {
		return "Smith";
	}
	@Override
	long mobNo() {
		return 8066532414l;
	}
	@Override
	SimpleDateFormat DOB() {
		return new SimpleDateFormat("2018/07/03");
	}
	@Override
	Address getaddress() {
		
		
		return new Address(411052, "Pune");
	}
	@Override
	public String toString() {
		return "Student [Name : " + getName() + ", mobNo : " + mobNo() + ", DOB : " + DOB().format(date) + ", Address : "
				+ getaddress() + "]";
	}
	
}
class Teacher extends Person{
	
	@Override
	String getName() {
		return "Yogesh";
	}

	@Override
	long mobNo() {
		return 7276554215l;
	}

	@Override
	SimpleDateFormat DOB() {
		//date=new Date();
		return new SimpleDateFormat("1989/09/25");
	}

	@Override
	Address getaddress() {
		return new Address(411052, "Latur");
	}

	@Override
	public String toString() {
		return "Teacher [Name : " + getName() + ", MobNo : " + mobNo() + ", DOB : " + DOB().format(date) + ", Address : "
				+ getaddress() + "]";
	}
	
}
class Address{
	int pincode;
	String city;
	static String State;
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	static{
		State="MH";
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nAddress [city=" + city + " state = " + State +" pincode=" + pincode + "]";
	}
	
	
}