import java.io.*;
import java.util.Scanner;
class Employee 
{
	int empid;
	String empName;
	double empSalary;

	Scanner sc = new Scanner(System.in);

	void getdata(){
		
		System.out.println("Enter Emp number: ");
		empid = sc.nextInt();
		sc.nextLine(); // clear newline
		
		System.out.println("Enter Emp Name: ");
		empName = sc.nextLine();

		System.out.println("Enter Emp Salary: ");
		empSalary = sc.nextDouble();
		sc.nextLine(); // clear newline
	}
	void show()
	{
		System.out.println("Emp ID: "+empid);
		System.out.println("Emp Name: "+empName);	
		System.out.println("Emp Salary: "+empSalary);
	}
}
class Employee_Details
{
	public static void main(String args[])
	{
		Employee e[] = new Employee[5];
		for(int i=0; i<2; i++)
		{
			e[i] = new Employee();
			e[i].getdata();
		}
		
		System.out.println("Employee Details");
		for(int i=0; i<5; i++)
		{
			e[i].show();
		}
	}
}