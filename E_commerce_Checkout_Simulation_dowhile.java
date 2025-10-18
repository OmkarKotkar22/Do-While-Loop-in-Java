import java.util.Scanner;
public class E_commerce_Checkout_Simulation_dowhile 
{
	public static void main(String x[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	int totalBill = 0;
        	String choice;

        	do 
		{
			System.out.println("============= Items =============");
        		System.out.println("1. Apple      Rs.80");
            		System.out.println("2. Kiwi       Rs.100");
            		System.out.println("3. Pineapple  Rs.50");
            		System.out.println("4. Banana     Rs.40");
            		System.out.println("skip");
            		System.out.println("checkout");
            		System.out.print("Enter your choice: ");
            		choice = sc.next(); 

            
            		if (choice.equals("skip")) 
			{
        		        continue; 
            		}

            		if (choice.equals("checkout")) 
			{
                		break; 
            		}
            
            		switch (choice) 
			{
                		case "1": totalBill += 80; break;
                		case "2": totalBill += 100; break;
                		case "3": totalBill += 50; break;
                		case "4": totalBill += 40; break;
                		default: System.out.println("Invalid Choice...");
            		}
        	} 
        	while (true);
            	System.out.println("Total Bill: Rs." + totalBill);
	}
}
