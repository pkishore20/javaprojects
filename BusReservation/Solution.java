package jspiders;
import java.util.Scanner;
public class Solution 
{
   public static void main(String[] args) 
   {
	   Scanner s =new Scanner(System.in);
	  BusBooking bus=new BusBookingImpl(30);//upcasting
	  while(true) 
	  { 
		  System.out.println("1.bookTicket") ;
	      System.out.println("2.cancelTicket");
		  System.out.println("3.viewTickets");
		  System.out.println("4.Exit");
		  System.out.println("Enter the Choice:");
		  int choice =s.nextInt();
		  switch(choice) 
		  {
		  case 1:
			  System.out.println("Enter the tickets");
              bus.bookTicket(s.nextInt());
			  break;
			case 2:
				System.out.println("Enter the CancelTickets");
			    bus.cancelTicket(s.nextInt());
				break;
			case 3:
				System.out.println(bus.viewTickets());
				break;
			case 4:
				System.out.println("thankYou");
				System.exit(0);
				break;
				default:
					System.out.println(bus.displayErrorMessage());
		  }
	  }
	  
	  
   }
}
