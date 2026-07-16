import java.util.Scanner;
class Person
{
	String name;
	double salary;
	int age;
	String designation;
	
	public Person(String name, double salary,int age,String designation)
	{
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.designation = designation;
	}
	
	void display()
	{
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Salary"+salary);
		System.out.println("Age: "+age);
		System.out.println("Designation: "+designation);

	}
}

class Employee extends Person
{
	public Employee(String name,double salary,int age,String designation)
	{
		super(name,salary,age,designation);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee employees[] = new Employee[3];
		
		for(int i=0; i< employees.length; i++)
		{
			System.out.println("Enter the details of Employee"+(i+1));
			System.out.println("Enter name,salary, age & designation");
			String name = sc.nextLine();
			double salary = sc. nextDouble();
			int age = sc.nextInt();
			sc.nextLine();
			String designation = sc.nextLine();
			
			employees[i] = new Employee(name,salary,age,designation);
		}
		
		System.out.println("Employee Records");
		
		for(Employee emp: employees)
		{
			emp.display();
		}
		sc.close();
	}
}