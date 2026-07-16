import java.util.Scanner;
class Account
{
int accno;
String accname;
double balance;

Account(int accno, String accname, double balance)
{
this.accno= accno;
this.accname= accname;
this.balance = balace;
}
void deposite(double deposit_amount)
{
balance = balance + deposit_amount;
System.out.println("Your new available balance is: " + balance);
}
void withdraw(double amount)
{
if(balance>amount)
{
balance = balance-amount;
System.out.printly("Your current balance: " + balance);
}
else if(balance == amount)
{
System.out.println("Your current balance is "+balance+". Your minimum balance should be 100. Hence cannot withdraw.");
}
else{
System.out.println("Insufficient balance");
}
}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the account name, account number and balance: ");
	int a_no = sc.nextInt();
	String a_name = sc.nextLine();
	double bal = sc.nextFloat();
	a = new Account(a_no,a_name,bal);
	 System.out.println("Enter\n 1 for depositing \n 2 for withdrawal"); 
	int option = sc.nextInt();
	switch(option)
	{
		case 1:
		System.out.println("Enter the amount to deposite: ");
		amount = sc.nextInt();
		a.deposite(amount);
		break;
	
		case 2:
		System.out.println("Enter the amount to withdraw: ");
		amount= sc.nextInt();
		a.withdraw(amount);
		break;
		default:System.out.println("Enter a valid option: ");
		break;
	}
}
}
