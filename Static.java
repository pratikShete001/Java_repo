class Test
{
	public static int x;
	public static void show(){
		System.out.println("In show method");
	}
}
class Static{
	public static void main(String args[])
	{
		Test.show();
		System.out.println("In Main method");
	}
}
		