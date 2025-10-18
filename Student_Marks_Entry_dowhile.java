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



// import java.util.Scanner;
// public class Student_Marks_Entry_dowhile
// {
// 	public static void main(String x[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int marks = 0;
// 		String choice;
//                 String enter="";
//                 //int avg=0;
// 		do
// 		{
//                         System.out.println("You enter the Marks If Marks Enter enter Y if you don't want to enter the marks enter N ");
//                         enter = sc.nextLine();
                        
// 			if(enter.equals("Y"))
// 			{
// 				System.out.println("1. Marks");
// 				System.out.println("2. Stop");

// 				System.out.println("Enter your Choice:");
// 				choice = sc.next();
                         	
// 				//System.out.println("Enter the marks:");
// 				//marks = sc.nextInt();
			
// 				switch(choice)
// 				{
// 					case "1":
// 						//if(marks < 0) 
// 						//{
// 						//	System.out.println("Marks are negative");
// 						//	continue;
// 						//}
// 						//else
// 						//{
// 							if(marks > 0)
// 							{
// 								System.out.println("Enter the marks: ");
// 								marks = sc.nextInt();
// 								continue;
// 							}
// 							int avg = (marks / 500) * 100;
// 							System.out.println(avg);
// 						//}
// 					case "2":
// 						break;
// 				}
// 			}
// 			else
// 			{
// 				System.exit(0);
// 			}    
// 		}
// 		while(true);
// 	}
// }