package com.sortinglogic;
import java.util.Comparator;
import com.jspiders.Student;
public class SortStudentsByAge implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		return o1.getAge()-o2.getAge();
	}
}