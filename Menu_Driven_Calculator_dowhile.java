import java.util.Scanner;
public class Menu_Driven_Calculator_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{	
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Multi");
			System.out.println("4. Div");
			System.out.println("5. Exit");

			System.out.println("Enter the Choice: ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1: 
					System.out.println("Enter the first number:");
					int a = sc.nextInt();
					System.out.println("Enter the second number:");
					int b = sc.nextInt();
					System.out.println("Addition:"+ (a+b));
					break;

				case 2: 
					System.out.println("Enter the first number:");
					a = sc.nextInt();
					System.out.println("Enter the second number:");
					b = sc.nextInt();
					System.out.println("Subtraction:"+ (a-b));
					break;

				case 3: 
					System.out.println("Enter the first number:");
					a = sc.nextInt();
					System.out.println("Enter the second number:");
					b = sc.nextInt();
					System.out.println("Multiplication:"+ (a*b));
					break;

				case 4: 
					System.out.println("Enter the first number:");
					a = sc.nextInt();
					System.out.println("Enter the second number:");
					b = sc.nextInt();
					System.out.println("Division:"+ (a/b));
					break;

				case 5:
					System.out.println("Exit");
					break;

				default:
					System.out.println("Invalid Choice");
			}
		}
		while(choice != 5);
	}
}
