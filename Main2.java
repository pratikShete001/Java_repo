import maths.Calculator;

public class Main2
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.add(5,2);
		System.out.println("Addition "+c.add(5,2));
		System.out.println("Multiplication "+c.mul(5,2));
		
	}
}