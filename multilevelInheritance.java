import java.io.*;
class Account
{
	String customer;
	int accNo;
	public Account(String customer, int accNo)
	{
		this.customer = customer;
		this.accNo = accNo;
	}
	
	void display()
	{
		System.out.println("Customer name: "+customer);
		System.out.println("Account Number: "+accNo);
	}	
}
class SavingAcc extends Account
{
	int minBal;
	int savBal;
	 SavingAcc(String customer, int accNo, int minBal, int savBal)
	{
		super(customer,accNo);
		this.minBal= minBal;
		this.savBal = savBal;
	}
	 void output()
	{
		display();
		System.out.println("Minimum Balance: "+minBal);
		System.out.println("Saving Balance: "+savBal);	
	}
}
class Acc_details extends SavingAcc
{
	int depositAmt;
	int widrawAmt;
	 Acc_details(String customer, int accNo, int minBal, int savBal,int depositAmt, int widrawAmt)
	{
		this.depositAmt = depositAmt;
		this.widrawAmt = widrawAmt;
		super(customer, accNo, minBal, savBal);
	}
	 void show()
	{
		output();
		System.out.println("Deposited Amount: "+depositAmt);
		System.out.println("WidrawAmt Amount: "+widrawAmt);	
	}
}
class Sample
{
	public static void main(String args[]){
	Acc_details acc = new Acc_details("Pratik",123,2500,75000,20000,3434343);
	acc.show();
}
}