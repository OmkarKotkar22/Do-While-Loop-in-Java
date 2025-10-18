import java.util.Scanner;
public class Train_Ticket_Booking_dowhile
{
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		 int choice=0;
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int f = 0 ;
		do
		{
                        System.out.println(" seat no 1a");
                        System.out.println(" seat no 2b");
                        System.out.println(" seat no 3c");
                        System.out.println(" seat no 4d");
                        System.out.println(" seat no 5e");

			/*System.out.println("Train number\t Train Name\t\t available seat\t");
			System.out.println("11026\t\t pune-Amr express\t 50");
			System.out.println("12006\t\t Hawada express\t 50");
			System.out.println("15325\t\t pune-Nag express\t 50"); 
			System.out.println("10014\t\t Special Super express\t 50");*/
			
                        System.out.println("Enter the seat no: ");
			 f = sc.nextInt();
			
			
                        
                        System.out.println("Enter the Choice ");
                        choice = sc.nextInt();


			switch(choice)
			{
				case 1:
                                       a = f;
                                       if(a==0){
                                         System.out.println("Seat not book");
                                        }else{
                                          System.out.println("Seat  book");
                                         }
					break;
                                 
                                case 2: 
                                        b = f;
                                          if(b==0){
                                         System.out.println("Seat not book");
                                        }else{
                                          System.out.println("Seat  book");
                                         }

                                       break;
                                 case 3: 
                                        c = f;
                                           if(c==0){
                                         System.out.println("Seat not book");
                                        }else{
                                          System.out.println("Seat  book");
                                         }

                                       break;
                                 case 4: 
                                           d = f;
                                         if(d==0){
                                         System.out.println("Seat not book");
                                        }else{
                                          System.out.println("Seat  book");
                                         }

                                        
                                       break;
                                 case 5: 
                                        e = f;
                                          if(e==0){
                                         System.out.println("Seat not book");
                                        }else{
                                          System.out.println("Seat  book");
                                         }

                                       break; 
			}
			
		}
		while(true);
	}
}