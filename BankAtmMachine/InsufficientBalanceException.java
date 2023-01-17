package jspider;
public class InsufficientBalanceException extends RuntimeException
{
    private String message;
	public InsufficientBalanceException(String message)
	{
		this.message = message;
	}
	
    public String getMessage() 
    {
		return message;
	}
    
}
// book   ticket
//cancel  ticket
//view    tickets
//display errorMessage