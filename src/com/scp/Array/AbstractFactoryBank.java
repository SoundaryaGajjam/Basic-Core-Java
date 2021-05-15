package com.scp.Array;



public class AbstractFactoryBank {
	public static void main(String[] args) {
		AbstractFactories1 hdfcObj=new HDFCFactory();
		
		Bank1 ob1=BankFactory1.getBankInstance(hdfcObj);
		System.out.println(ob1);
		
	}

}
abstract class Bank1{
	abstract public String getBankName();
	abstract public int IFSCCode();
	@Override
	public String toString() {
		return "\nBank [getBankName()=" + getBankName() + ", IFSCCode()=" + IFSCCode() + "]";
	}
	
}
class HDFC1 extends Bank1{
	public String getBankName(){
		return "HDFC";
	}
	public int IFSCCode(){
		return 111111;
	}
}
class ICICI1 extends Bank1{

	@Override
	public String getBankName() {
		return "ICICI";
	}

	@Override
	public int IFSCCode() {
		return 222222;
	}
}

abstract class Account1{
	abstract public String accountType();
	abstract public int accountNumber();
}
class Saving extends Account1{
	@Override
	public String accountType() {
		return "Saving";
	}

	@Override
	public int accountNumber() {
		return 101010101;
	}
	
}
class Current extends Account1{

	@Override
	public String accountType() {
		return "Current";
	}

	@Override
	public int accountNumber() {
		return 32313210;
	}
	
}
interface AbstractFactories1{
	Bank1 getBank();
	Account1 getAccount();
}
class HDFCFactory implements AbstractFactories1{

	@Override
	public Bank1 getBank() {
		return new HDFC1();
	}

	@Override
	public Account1 getAccount() {
		return null;
	}
}

class ICICIFactory implements AbstractFactories1{

	@Override
	public Bank1 getBank() {
		return new ICICI1();
	}

	@Override
	public Account1 getAccount() {
		// TODO Auto-generated method stub
		return null;
	}
}

class BankFactory1{
	public static Bank1 getBankInstance(AbstractFactories1 aFactory){
		return aFactory.getBank();
		
	}
}