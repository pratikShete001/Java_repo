import java.util.*;
class DemoArrayList
{
	public static void main(String args[])
	{
	ArrayList<String> a = new ArrayList();
	a.add("Pune");
	a.add("Patna");
	a.add("Hydrabad");
	a.add("Satara");
	
	System.out.println(a);
	a.remove("Patna");
	System.out.println(a);
	}
}