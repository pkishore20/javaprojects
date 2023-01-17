package jspiders;
public class BusBookingImpl implements BusBooking
{
	int AviableTickets;
	public BusBookingImpl(int balance) 
	{
		this.AviableTickets = balance;
	}
	public void bookTicket(int tickets) 
	{
      if(AviableTickets>=tickets) 
      { AviableTickets =AviableTickets -tickets;
    	System.out.println("your sucessful booked tickets");
      }
      else 
      {
    	  try 
    	  {
    		  new InsufficentTicketsException("Insufficent Tickets Available");
    	  }
    	  catch(Exception e)
    	  {
    		System.out.println(e.getMessage());  
    	  }
      }
	}
	public void cancelTicket(int tickets) 
	{
		AviableTickets =AviableTickets+tickets;
		System.out.println("tickets are cancelled");
	}
	public int viewTickets()
	{
		return AviableTickets;
	}

	public String displayErrorMessage() 
	{
		return "Invalid choice ,kindly Enter Valid Choice";
	}

}