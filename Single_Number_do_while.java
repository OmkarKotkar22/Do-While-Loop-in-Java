import java.util.Scanner;
public class Single_Number_do_while
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int choice;
		do
		{
			System.out.println("=========MENU=========");
			System.out.println("1. Count the number of digits");
			System.out.println("2. Count how many digits are even");
			System.out.println("3. Find the product of all odd digits");
			System.out.println("4. Check if the number is an Armstrong number");
			System.out.println("5. Exit the program");

			System.out.println("Enter the choice: ");
			choice = sc.nextInt();

			int temp = no;
			switch(choice)
			{
				case 1:
					int count = 0;
					while(temp != 0)
					{
						count++;
						temp = temp / 10;
					}
					System.out.println("Count the number of digits: " + count);
					break;

				case 2:
					count = 0;
					while(temp != 0)
					{
						if(temp % 2 == 0)
						{
							count++;
						}
						temp = temp / 10;
					}
					System.out.println("Total count how many digits are even: " + count);
					break;

				case 3:
        				int prod = 1;
					while(temp != 0)
					{
						if(temp > 0)
						{
        					        if(temp % 2 != 0)
        					        {
                					 	int digit = temp % 10;
								prod = prod * digit;
                					}
						}
						temp = temp / 10;
					}
					System.out.println("The product of all odd digits: " + prod);
					break;

				case 4:
					count = 0;
					int sum = 0;
					while(no != 0)
					{
						++count;
						no = no / 10;
					}
	
					no = temp;
					while(no != 0)
					{
						int rem = no % 10;
						no = no / 10;

						int j = 1, p=1;
						while(j <= count)
						{
							p = p * rem;
							j++;
						}
						sum = sum + p;
					}
					String str = (temp == sum) ? "Number is Armstrong" : "Number is not Armstrong";
					System.out.println(str);
					break;

				case 5:
					System.out.println("Exiting the program");
					break;

				default:
					System.out.println("Invalid choice");
			}
		}
		while(choice != 5);
	}
}
