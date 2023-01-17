package jspiders;

public  class CalculatorImpl  implements Calculator
{
     public  String add(int a,int b)
   {
	return "sum of "+a+"&"+b+"is"+(a+b);
   }
    public  String sub(int a,int b)
     {
  	return "Difference of "+a+"&"+b+"is"+(a-b);
     }
    public  String mul(int a,int b)
    {
 	return "product of "+a+"&"+b+"is  :"+(a*b);
    }
    public  String div(int a,int b)
    {
        if(b!=0) 
        {	
      	return "Division of "+a+"&"+b+"is"+(a/b);
 	    }
    else 
      {
      return "Invalid Denominatir";	
      }
    }
	public String displayErrorMessage() 
	{
		return "Invalid";
	}
}
