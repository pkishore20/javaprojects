package com.jspiders;
public class Student
{
   private String name;
  private String id;
 private  int  marks;
 private  int age;
   static int count =101;
public Student(String name, int marks, int age) {
	this.name = name;
	this.id = "jsp"+ count++;
	this.marks = marks;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getId() {
	return id;
}
@Override
public String toString() {
	return "Studentname is" + name + " id is" + id + " marks is" + marks + " age is" + age ;
}  

}
