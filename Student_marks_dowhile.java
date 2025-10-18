import java.util.*;

public class Student_marks_dowhile
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int marks = 0;
		int sum = 0, count = 0;
		double avg = 0.0;
		do 
		{
			System.out.println("Enter the marks: ");
			marks = sc.nextInt();

			if(marks < 0)
			{
				continue;
			}
			else
			{
				sum = sum + marks;
				count++;
			}

			avg = sum / count;
			System.out.println("Avg" + avg);
		}
		while(true);
	}
}