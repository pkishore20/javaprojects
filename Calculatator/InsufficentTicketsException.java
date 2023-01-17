package jspiders;
public class InsufficentTicketsException  extends RuntimeException
{
  private String Msesage;
public InsufficentTicketsException(String msesage) 
{
	Msesage = msesage;
}
public String getMsesage() 
{
	return Msesage;
}  
}