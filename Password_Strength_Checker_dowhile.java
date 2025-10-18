import java.util.Scanner;
public class Password_Strength_Checker_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		do
		{
			System.out.print("Enter the Pwd: ");
			str = sc.next();
			if(str.equals("Quit"))
			{
				break;
			}
			if(str.length() < 6)
			{
				System.out.println("password length is less than 6 characters");
				continue;
			}
			System.out.print("Password Accepted");
			break;
		}
		while(true);
	}
}