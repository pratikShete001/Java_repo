import java.util.Scanner;
public class PizzaBill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int vegPizzaPrice = 0;
		int nonVegPizzaPrice = 0;
		System.out.println("1.Veg");
		System.out.println("2.Non Veg");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			vegPizzaPrice = 200;
			System.out.println("Enter Quantity: ");
			int quantity = sc.nextInt();
			System.out.println("Total Amoutn: "+(vegPizzaPrice*quantity));
		}
		else if(choice == 2)
		{
			nonVegPizzaPrice = 300;
			System.out.println("Enter Quantity: ");
			int quantity1 = sc.nextInt();
			System.out.println("Total Amount: "+(nonVegPizzaPrice*quantity1));
		}
		else{
			System.out.println("Plz Enter valid Choice");
		}
	}
}
			