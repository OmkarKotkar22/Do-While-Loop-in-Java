import java.util.Scanner;
public class Email_Address_Validator_dowhile
{
	public static void main(String x[])
	{
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the email");
			String str = sc.next();

			if(str.equals("cancel"))
				break;
			
			if(!str.contains("@"))
			{
				System.out.println("Invalid email, try again");
			}

			else
			{
				System.out.println("Email Accepted");
				System.exit(0);	
			}
		}
		while(true);
	}
}



			