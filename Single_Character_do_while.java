import java.util.Scanner;
public class Single_Character_do_while 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single character: ");
		char ch = sc.next().charAt(0);

		int choice;
		do 
		{
			System.out.println("------- MENU -------");
			System.out.println("1. Check if the character is an alphabet");
			System.out.println("2. If alphabet, check vowel or consonant");
			System.out.println("3. If digit, check even or odd");
			System.out.println("4. Convert uppercase to lowercase or vice versa");
			System.out.println("5. Exit the program");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) 
			{
				case 1:
					if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
					{
						System.out.println("Character is an Alphabet");
					} 
					else 
					{
						System.out.println("Character is NOT an Alphabet");
					}
					break;

				case 2:
					if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
					{
						char lowerCh = Character.toLowerCase(ch);
						if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') 
						{
							System.out.println("Character is a Vowel");
						} 
						else 
						{
							System.out.println("Character is a Consonant");
						}
					} 
					else 
					{
						System.out.println("Not an alphabet, cannot check vowel/consonant");
					}
					break;

				 case 3:
					if (ch >= '0' && ch <= '9') 
					{
						if (ch % 2 == 0) 
						{
							System.out.println("Digit is EVEN");
						} 
						else 
						{
							System.out.println("Digit is ODD");
 						}
					} 
					else 
					{
						System.out.println("Not a digit, cannot check even/odd");
					}
					break;

				case 4:
					if (Character.isUpperCase(ch)) 
					{
						System.out.println("Converted to Lowercase: " + Character.toLowerCase(ch));
					} 
					else if (Character.isLowerCase(ch)) 
					{
						System.out.println("Converted to Uppercase: " + Character.toUpperCase(ch));
					} 
					else 
					{
						System.out.println("Not an alphabet, cannot convert case");
					}
	 				break;

				case 5:
					System.out.println("Exiting the program");
					break;

				default:
					System.out.println("Invalid choice");
			}

		} 
		while (choice != 5);
	}
}
