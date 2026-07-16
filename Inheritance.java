class Calculation 
{
	void add(int a,int b)
	{
		z =  a +b;
		System.out.println("Addition  is :"+z);
	}
	
	void sub()
	{
		z =  a - b;
		System.out.println("Substraction  is :"+z);
	}
	
}

public Class MyCalculation extends Calculation
{
	void mul()
	{
		z = a*b;
		System.out.println("Multiplication  is :"+z);
	}

	public static void main(String args[])
	{
		
		int a,b,z;
		Calculation cal = new Calculation();
		cal.add(5,5);
		cal.sub(5,5);
		
	}
}
