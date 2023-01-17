package jspider;
class BankImpl implements Bank
{
  private	int balance;
  public BankImpl(int balance) 
  {
	this.balance = balance;
  }
public void deposit(int amount) 
  {
	 System.out.println("Deposit Rs"+ amount); 
	 balance = balance +amount;
	 System.out.println("Amount deposited suceesfully"+ amount);
  }
  public void withdraw(int amount)
  { 
	  if(amount <=balance) 
     {
	  System.out.println("withdraw Rs"+ amount );
	  balance = balance -amount;
	  System.out.println(" Amount withdrawn suceesfully "+ amount );
      }
	  else {
		  try 
		  {
			throw new  InsufficientBalanceException("Insufficent Balance");
		  }
		  catch(Exception e) 
		  {
			System.out.println(e.getMessage());  
		  }
	  }
  }
  public int getBalance() 
  {
	  return balance;
  }
public String displayErrorMessage()
   {
	return "Invalid choice,Kindy Enter the choice";
    }
}























