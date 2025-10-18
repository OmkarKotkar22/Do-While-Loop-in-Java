import java.util.Scanner;
public class bank_balance_do_while
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Initial balance: ");
		int bal = sc.nextInt();
		do
		{

			System.out.println("--------Menu--------");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdrawal Amount");
			System.out.println("3. Check current balance");
			System.out.println("4. Exit");
			System.out.println("--------------------");

			System.out.println("Enter the your choice: ");
			String choice = sc.next();
			int total_balance=0;
			int total = 0;
			switch(choice)
			{
				case "1": 
					System.out.println("Deposit Amount: ");
					int deposit = sc.nextInt();
					bal = bal + deposit;
					continue;

				case "2":
					System.out.println("Withdrawal Amount: ");
					int withdraw = sc.nextInt();
					bal = bal - withdraw;
					continue;

				case "3":
					System.out.println("Current balance: ");
					total_balance = bal;
					System.out.println("Current balance in Account: " + total_balance);
					continue;

				case "4":
					System.exit(0);
				
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		while(true);
	}
}