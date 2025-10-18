import java.util.Scanner;
public class  Number_Guessing_Game_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int no = 31;

		do
		{
			System.out.println("Enter the number:");
			num = sc.nextInt();
			if(no < num)
			{
				System.out.println("Number is too high");
				continue;
			}

			if(no == num)
			{
				System.out.print("You guessed it!");
				break;		
			}
	
			if(no > num)
			{
				System.out.println("Number is too low");
				continue;
			}
		}
		while(true);	
	}
}