 class Rectangle 
 {
	int length;
	int breadth;
	int area;
	static int rectCount;
	 Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		rectCount++;
	}
	void area()
	{
		area = length * breadth;
		System.out.println("Area of Rectangle " +Rectangle.rectCount+ " is " +area);
		
	}
 }
 
 public class Constructor
 {
	 public static void main(String args[])
	 {
		Rectangle r= new Rectangle(5,5);
		r.area();
		Rectangle r1= new Rectangle(6,5);
		r1.area();
	 }
	 
 }