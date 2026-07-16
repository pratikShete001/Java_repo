import java.util.*;
public class CollectionInterface
{
	public static void main(String args[])
	{
		List l1 = new ArrayList();
		List<String> l2 = new ArrayList<String>();
		l1.add(10);
		l1.add(20);
		l2.add("Btech");
		l2.add("Smart");
		l2.add("Class");
		l1.addAll(l2);
		System.out.println("Elements of List 1: "+l1);
		System.out.println("Search for Btech: "+l1.contains("Btech"));
		System.out.println("Search for list 2 in list 1: "+l1.containsAll(l2));
		System.out.println("Check Whether list 1 and list 2 are equal: "+l1.equals(l2));
		System.out.println("Check is list 1 empty: "+l1.isEmpty());
		System.out.println("Size of l1: "+l1.size());
		System.out.println("Hashcode of list 1: "+l1.hashCode()); // what is hash code?
		System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		l2.clear();
		System.out.println(l2);
	}
}