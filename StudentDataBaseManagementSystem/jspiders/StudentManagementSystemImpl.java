package com.jspiders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.customexception.InvalidChoiceException;
import com.customexception.StudentNotFoundException;
import com.sortinglogic.SortStudentsByAge;
import com.sortinglogic.SortStudentsById;
import com.sortinglogic.SortStudentsByMarks;
import com.sortinglogic.SortStudentsByName;
public class StudentManagementSystemImpl  implements StudentManagementSystem
{
	Map<String,Student> l= new LinkedHashMap<String,Student>();
	Scanner sc= new Scanner(System.in);
	public void addStudent()
	{
		System.out.println("Enter the name");
		String name= sc.next();
		System.out.println("enter the the age");
		int age=sc.nextInt();
		System.out.println("enter the Marks:");
		int marks= sc.nextInt();
		Student s= new Student (name,age,marks);
		l.put(s.getId(), s);
		System.out.println("student record Inserted Sucessfully");
		
		System.out.println("your Student Id is "+s.getId());
	}
	public void displayStudent()
	{
	   System.out.println("Enter the Id to Display  ");	
	   String id = sc.next();
	   id.toUpperCase();
	   if(l.containsKey(id)) 
	   {
		   Student s= l.get(id);
		   System.out.println("Id:"+s.getId());
		   System.out.println("Name :"+s.getName());
           System.out.println("age:"+ s.getAge());
		   System.out.println("Marks:"+s.getMarks());
	   }
	   else {
		   try {
		 throw new StudentNotFoundException("Invalid student Id");  
	   }
		   catch(Exception e) 
		   {
		   System.out.println(e.getMessage());
	   }
		   }
	}
	public void displayAllStudent() 
	{
		Set <String >keys =l.keySet();
		System.out.println("Students records Are");
		if(l.size()!=0) 
          {
			for(String key:keys) 
			{
			System.out.println(l.get(key));	
			}
		  }
		else
		{
		  try  
		  {
			throw new StudentNotFoundException("Students Records are not Found");
		  }
		  catch(Exception e)
		  {
			System.out.println(e.getMessage());  
		  }
		}
	}
	public void removeStudents()
	{
		System.out.println("enter The Students Id :");
		String id =sc.next().toLowerCase();
		if(l.containsKey(id)) 
		{
			l.remove(id);
           System.out.println("Students Records are Deleted Sucessfully");
		}
		else {
			try 
			{
			   throw new StudentNotFoundException("Students Records Not Found");	
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public void removeAllStudents() 
	{
		System.out.println(l.size()+"Students Records are Available");
		l.clear();
		System.out.println("Students Records are deleted Sucessfully");
	}
	public void updateStudents() 
	{
		System.out.println("Enter the Students Id:");
		String id= sc.next().toLowerCase();
		if(l.containsKey(id)) 
	{
        Student st=l.get(id);			
		System.out.println("1.update Name\n2.updateAge \n3.updateMarks");
		System.out.println("Enter choice:");
		int choice =sc.nextInt();
		switch(choice) 
	 {
		case 1:
			System.out.println("Enter Name:");
			String name=sc.next();
			st.setName(name);
			System.out.println("Name update Sucesfully");
			break;
		case 2:
			System.out.println("Enter Age:");
			int Age =sc.nextInt();
			st.setAge(Age);
			System.out.println("Age update Sucesfully");
			break;
		case 3:
			System.out.println("Enter Marks");
			int mark=sc.nextInt();
			st.setMarks(mark);
			System.out.println("marks update Sucesfully");
			break;
		default:
			
		try {
		 throw	new InvalidChoiceException("Invalid choice");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	 }
		else {
		try {
	        throw new StudentNotFoundException("Students Records are Not Found ");	
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
		}
	}
	public void countStudents() 
	{
		System.out.println("Total Students Are :"+l.size());
	}
	public void sortStudents() 
	{
		Set <String>set=l.keySet();
		List<Student>al=new ArrayList<Student>();
		for(String key :set)
		{
		  al.add(l.get(key));	
		}
		System.out.println("1.SortStudentsby Id\n2.SortsStudentby Name ");
		System.out.println("3.SortStudentsby Age \n4.SortStudentsBy Marks");
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice) 
		{
		case 1:
			Collections.sort(al,new SortStudentsById());
			for(Student s: al)
			{
			System.out.println(s);	
			}
			break;
		case 2:
			Collections.sort(al,new SortStudentsByName());
			for(Student s: al)
			{
			System.out.println(s);	
			}
			break;
		case 3:
			Collections.sort(al,new SortStudentsByAge());
			for(Student s: al)
			{
			System.out.println(s);	
			}
			break;
		case 4:
			Collections.sort(al,new SortStudentsByMarks());
			for(Student s: al)
			{
			System.out.println(s);	
			}
			break;
		default:
			try {
				 throw	new InvalidChoiceException("Invalid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}