package com.scp.doubts;

import java.io.*;



public class Serialization_Keyword {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//int i=10;
		Test t=new Test(20);
		File file=new File("pqr1.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.close();
		System.out.println("Serialization completed...");
		
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test newOb= (Test) ois.readObject();
		ois.close();
		System.out.println(newOb);
		System.out.println("Deserialization completed...");
	}

}
class Test implements Serializable{
	 int i;
	public Test(){
		System.out.println("Default");
		
	}
	
	public Test(int i) {
		super();
		this.i = i;
		System.out.println("Para");
	}

	@Override
	public String toString() {
		return "Demo [i=" + i + "]";
	}
	
}