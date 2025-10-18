import java.util.Scanner;
public class Temperature_Logger_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int temp , choice;
		do
		{
			System.out.println("1. Enter the temp");
			System.out.println("2. stop");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Temperature:");
					temp = sc.nextInt();
					if(temp < 0)
					{
						System.out.println("Invalid reading");
						continue;
					}
					if(temp > 0)
					{
						System.out.println("todays temp: " + temp);
					}

				case 2:
					break;
			}
		}
		while(choice != 2);
	}
}