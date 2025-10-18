import java.util.Scanner;
public class Restaurant_Ordering_System_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int total_Bill = 0;
		String choice;
		do
		{
			System.out.println("===========Food Items============");
			System.out.println("1. Normal Paneer    Rs.200");
			System.out.println("2. Tiranga Paneer   Rs.350");
			System.out.println("3. Mix Veg          Rs.250");
			System.out.println("4. Paneer Masala    Rs.300");
			System.out.println("5. Done");
			

			System.out.println("Enter your Choice");
			choice = sc.next();

			if(choice.equals("Done"))
			{
				break;
			}
			switch(choice)
			{
				case "1": total_Bill +=200; break;
				case "2": total_Bill +=350; break;
				case "3": total_Bill +=250; break;
				case "4": total_Bill +=300; break;
				default: System.out.println("Invalid Choice...");
			}
		}
		while(true);
		System.out.println("Total Bill is" + total_Bill);
	}
}