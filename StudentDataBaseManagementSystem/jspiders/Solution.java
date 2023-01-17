package com.jspiders;
import java.util.Scanner;

import com.customexception.InvalidChoiceException;
public class Solution 
{
  public static void main(String[] args)
  {
  
         StudentManagementSystem s= new  StudentManagementSystemImpl();
	   Scanner scan= new Scanner(System.in);
	  while(true) {
	   System.out.println("1: addStudent \n2: displayStudent \n3: displayAllStudent");
	   	System.out.println("4: removeStudents \n5: removeAllStudents \n6: updateStudents");
	   	System.out.println("7: countStudents \n8: sortStudents \n9: Exit");
	   	System.out.println("----");
      System.out.println("Enter the choice :");	
      int choice= scan.nextInt();
switch(choice)
{
case 1:
s.addStudent();
break;
case 2:
 s.displayStudent();
break;
case 3:
s.displayAllStudent();
break;
case 4:
s. removeStudents();
break;
case 5:
s. removeAllStudents();
break;
case 6:
s. updateStudents();
break;
case 7:
s. countStudents();
break;
case 8:
s. sortStudents();	
break;
case 9:
System.out.println("Thank you");
	System.exit(0);
	break;
	
default:
		try 
		{
			throw new InvalidChoiceException ("Invalid choice,Kindly enter the valid choice");
		}
		catch(Exception e) 
		{
		System.out.println(e.getMessage());	
		}
	  }
	  }
  }
}
