import java.util.Scanner;
public class Student_Marks_Entry_dowhile 
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);

        	int totalMarks = 0;
        	int count = 0;
        	String input;

        	System.out.println("Enter marks of students (type 'stop' to finish): ");

        	do 
		{
        		input = sc.nextLine();  // read input as string

            		if (input.equalsIgnoreCase("stop")) 
			{
                		break;  // exit loop
            		} 
            		else 
			{
                		int marks = Integer.parseInt(input); // convert to number

                		if (marks >= 0) 
				{
                    			totalMarks += marks;
                    			count++;
                		} 
				else 
				{
                    			System.out.println("Marks cannot be negative. Try again.");
                		}
            		}

        	} 
		while (true);

        	if (count > 0) 
		{
            		double average = (double) totalMarks / count;
            		System.out.println("Average marks: " + average);
        	} 
		else 
		{
            		System.out.println("No valid marks entered.");
        	}
	}
}
