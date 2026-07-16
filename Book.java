import java.util.Scanner;
class Book_Details
{
int bookId;
String bookName;
int bookprice;

void getdata(Scanner sc)
{
	System.out.println("Enter Book Id: ");
	bookId = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Book Name: ");
	bookName = sc.nextLine();
	System.out.println("Enter Price: ");
	bookprice = sc.nextInt();
	sc.nextLine();
	sc.nextLine();
}



void show()
{
	System.out.println("Book ID: "+bookId);
	System.out.println("Book Name: "+bookName);
	System.out.println("Price: "+bookprice);
}
}
public class Book
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Book_Details b[] = new Book_Details[5];
		for(int i =0; i<2; i++)
		{
			b[i] = new Book_Details();
			b[i].getdata(sc);
		}
		
		System.out.println("Book Details is:");
		for(int i =0; i<2; i++)
		{
			b[i].show();
		}
		
		
	}
}
	
