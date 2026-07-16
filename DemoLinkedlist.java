import java.util.*;
class DemoLinkedlist
{
	public static void main(String args[])
	{
		LinkedList<String>list1 = new LinkedList<String>();
		LinkedList<String>list2 = new LinkedList<String>();
		list1.add("Item 2");
		list1.add("Item 3");
		list1.add("Item 4");
		list1.add("Item 5");
		list1.addFirst("Item 0");
		list1.addLast("Item 6");
		list1.add(1,"Item 1");
		System.out.println(list1);
		list1.remove("Item 6");
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
		System.out.println("Updating linked list items");
		list2.set(0,"Red");
		list2.set(1,"Blue");
		list2.set(2,"Green");
		list2.set(3,"yello");
		list2.set(4,"Purple");
		System.out.println(list1);
		String[] list3 = list1.toArray();
		list1.toArray(list2);
		System.out.println(list3);
		

	}
}
