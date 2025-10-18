import java.util.Scanner;
public class atm_pin_validation_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int no = 1234;
		do
		{
			System.out.println("Enter the Pin");
			int num = sc.nextInt();
			if(no == num)
			{
				System.out.println("Access Granted");
				break;
			}
			else if(count == 4)
			{
				System.out.println("Card Blocked");
			}
			else
			{
				System.out.println("Pin is Invalid");
			}
			count++;
		}
		while(count != 5);
	}
}