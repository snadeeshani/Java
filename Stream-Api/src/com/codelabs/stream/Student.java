package com.codelabs.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

	String name;
	Date DOB;
	
	public static List<Student> getStudent()
	{
		List<Student> students= new ArrayList<>();
		students.add(new Student("Saman", new Date(1991-6-20)));
		students.add(new Student("Kamal", new Date(1999-2-16)));
		students.add(new Student("Nimal", new Date(2000-9-8)));
		students.add(new Student("Amal", new Date(2005-11-23)));
		students.add(new Student("Perera", new Date(2002-6-25)));
		students.add(new Student("Nuwan", new Date(2006-12-4)));
		students.add(new Student("Pasan", new Date(1989-6-20)));
		
		return students;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Student(String name, Date dOB) {
		super();
		this.name = name;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", DOB=" + DOB + "]";
	}
	
	
}
