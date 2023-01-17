package jspider;
import java.util.Scanner;
public class Solution 
{
  public static void main(String[] args) 
  { 
	  Scanner s = new Scanner (System.in); 
	  Bank b= new BankImpl(5000);//upcasted
	  while(true) 
	  {
	  System.out.println("1:Deposit Amount");
	  System.out.println("2:withdrawAmount");
	  System.out.println("3:check the balance");
	  System.out.println("4:Exist");
	  System.out.println("Enter the Choice :");
	  int choice =s.nextInt();
	 switch(choice) 
	 {
	 case 1:
		 System.out.println("Enter Amount the Deposited :");
		 b.deposit(s.nextInt());
		 break;
	 case 2:
		 System.out.println("Enter Amount to be Withdrawn: ");
		 b.withdraw(s.nextInt());
		 break;
	 case 3:
		 System.out.println("Aviable Balance :"+b.getBalance());
		 break;
	 case 4:
		 System.out.println("Thank You");
		 System.exit(0);
		 break;
     default:
    	System.out.println( b.displayErrorMessage());
			}
	 }
  }
}
