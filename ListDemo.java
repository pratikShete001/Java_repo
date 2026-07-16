import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();

        list1.add("Pratik");
        list1.add("Mahesh");
        list1.add("Vishal");
        list1.add("Om");
        list1.add("Prasad");
        list1.add("Ram");

        List<String> list2 = new LinkedList<>();

        list2.add("Jyoti");
        list2.add("Sangita");

        System.out.println("\nMethods of List Interface:");

        list1.add(6, "Ashvini") ; // Add element on specific Index
        System.out.println("Add Ashvini at index 6: " + list1);

        System.out.println("Object at index 3: " + list1.get(3));

        list1.addAll(3, list2);
        System.out.println("After adding list2 at index 3: " + list1);

        System.out.println("List before deleting element: " + list1);

        System.out.println("Deleted object from index 1: " + list1.remove(1));

        System.out.println("List after deleting element: " + list1);

        int idx = list1.indexOf("Vishal");
        System.out.println("Index of Vishal: " + idx);
		
		ListIterator<String> itr = list1.listIterator();

		while(itr.hasNext()) // For loop of Collection
		{
			System.out.println(itr.next());
		}
		System.out.println("Before:"+list1);
		String oldValue = list1.set(1,"Dattatray"); // replace element on specific location
		System.out.println("Replaced Element "+oldValue);
		System.out.println("After:"+list1);
		
    }
}