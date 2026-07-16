import java.util.*;
class CollectionDemo{
	public static void main(String args[])
	{
		List <String> language = Arrays.asList("Java", "Python","JavaScript");
		
		
		System.out.println("Programing languages:");
		for(String lang: language)
		{
			System.out.println(lang);
		}
	}
}