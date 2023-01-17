package com.sortinglogic;
import java.util.Comparator;
import com.jspiders.Student;
public class SortStudentsById implements Comparator <Student>
{
	public int compare(Student o1, Student o2) 
	{
		return o1.getId().compareTo(o2.getId());
	}
}