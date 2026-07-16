class Calculation 
{
	int z,a,b;
	void add(int a,int b)
	{
		z =  a +b;
		System.out.println("Addition  is :"+z);
	}
	
	void sub(int a,int b)
	{
		z =  a - b;
		System.out.println("Substraction  is :"+z);
	}
	
}

public class MyCalculation extends Calculation
{
	void mul(int a, int b)
	{
		z = a*b;
		System.out.println("Multiplication  is :"+z);
	}
	void show(int a,int b)
	{
		this.a = a;
		this.b = b;
		add(a,b);
		sub(a,b);
	}

	public static void main(String args[])
	{
		
		int a=5,b=5;
		MyCalculation cal = new MyCalculation();
		
		cal.show( a,  b);
		cal.mul(a,b);
		
	}
}
