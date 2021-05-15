package com.scp.test_Bar;

import java.util.ArrayList;
import java.util.List;

interface  Bag{
	 public void setValue(int val);
	
}
enum Type{
	Note,Coin;
}
class Note implements Bag{
	static List<Integer> listOfNotes=new ArrayList<>();
	
	@Override
	public void setValue(int val) {
		listOfNotes.add(val);
		
	}
	void diplay(){
		System.out.print("Notes ");
		for (Integer item : listOfNotes) {
			System.out.print(item);
		}
		//System.out.println(listOfNotes);
	}
}
class Coins implements Bag{
	static List<Integer> listOfCoins=new ArrayList<>();
	
	@Override
	public void setValue(int val) {
		listOfCoins.add(val);
		
	}
	void diplay(){
		System.out.println("\nCoins ");
		for (Integer item : listOfCoins) {
			System.out.print(item);
		}
		//System.out.println(listOfCoins);
	}
	
}
public class Pgm
{
	static Note n=new Note();
	static Coins c=new Coins();
	
	void add(Type t,int val){
		if(t.Note==Type.Note)
			n.setValue(val);
		else
			c.setValue(val);
	}
	
	public static void main(String[] args) {
		Pgm p=new Pgm();
		p.add(Type.Note,10);
		n.diplay();
		c.diplay();
	}
}
