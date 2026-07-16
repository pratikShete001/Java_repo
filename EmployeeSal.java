import java.util.Scanner;
class Employee
{
	String name;
	int salary;
	double da,hra,gr;
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
	try{
		
	System.out.println("Enter the name: ");
	name = sc.nextLine();
	
	System.out.println("Enter the salary: ");
	salary = sc.nextInt();
	sc.nextLine();
	}
	catch(Exception e)
	{
			System.out.println(e);

	}
	}
	
	void show()
	{
		System.out.println("Basic salary is: "+salary);
		System.out.println("Gross salary is: "+(salary*0.35));
	}
}

class EmployeeSal
{
	
	public static void main(String args[])
	{
		Employee e[] = new Employee[2];
		for(int i=0; i<2;i++)
		{
			e[i] = new Employee();
			e[i].get();
		}
		
		for(int i=0; i<2;i++)
		{
			e[i].show();
		}
	}
}
	
	