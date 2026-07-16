import java.util.Scanner;
class Calculation
{
	double per;
	Calculation(double cgpa)
	{
		if(cgpa>=9.0)
		{
			per = ((20*cgpa)-100);
			System.out.println("You Got "+per+"% Percent of marks");
		}
		else if(cgpa<=9.0 && cgpa>=8)
		{
			per = ((12*cgpa)-25);
			System.out.println("You Got "+per+"% Percent of marks");

		}
		else if(cgpa<=8.0 && cgpa>=7.0)
		{
			per = ((10*cgpa)-7.5);
			System.out.println("You Got "+per+"% Percent of marks");

		}
		else if(cgpa<=7.0 && cgpa>=6.0)
		{
			per = ((5*cgpa)-26.25);
			System.out.println("You Got "+per+"% Percent of marks");

		}
		else if(cgpa<=6.0 && cgpa>=5.0)
		{
			per = ((10*cgpa)-2.5);
			System.out.println("You Got "+per+"% Percent of marks");

		}
		else if(cgpa<=5.0 && cgpa>=4.0)
		{
			per = ((10*cgpa)-2.50);
			System.out.println("You Got "+per+"% Percent of marks");

		}
		else{
			System.out.println("You are fail");
		}
	}
}

class Cgpa_to_Percentage
{
	public static void main(String args[])
	{
		double cgpa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your cgpa");
		cgpa = sc.nextDouble();
		Calculation cal = new Calculation(cgpa);
		sc.close();
	}
}