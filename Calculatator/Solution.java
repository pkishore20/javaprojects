package jspiders;
import java.util.Scanner;
public class Solution 
{ 
	static Scanner s= new Scanner(System.in);
	 static int a;
	 static int b;
	static void accept() 
	{	System.out.println("enter the first number:");
		 a=s.nextInt();
		System.out.println("enter the Second number:");
		 b=s.nextInt();
	}
    public static void main(String[] args) 
    {
	Calculator calc =new CalculatorImpl();//upcasting
	while(true) {
	System.out.println("1:Addition");
	System.out.println("2:subtraction");
	System.out.println("3:multiplication");
	System.out.println("1:Division ");
	System.out.println("5: exist ");
	System.out.println("enter the choice:");
	int choice=s.nextInt();
	if(choice>=1&&choice <=4)  
	{
	   accept();	
	}
	switch (choice)
	  {
	case 1:  System.out.println(calc.add(a,b));
		break;
	case 2:  System.out.println(calc.sub(a, b));
		break;
	case 3:  System.out.println(calc.mul(a,b));
		break;
	case 4:   System.out.println(calc.div(a,b));
		break;
	case 5:   System.out.println("Thanking you");
	   System.exit(0);
	default:
		System.out.println(calc.displayErrorMessage());	
	  }
	
	System.out.println("-----");
    }  
  }
}