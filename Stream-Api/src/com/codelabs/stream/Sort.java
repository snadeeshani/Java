package com.codelabs.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	public static void main(String[] args) {
		
		List<Employee> sortedEmployee= Employee.getEmployees().stream()
				.sorted(Comparator.comparing(Employee :: getName)).collect(Collectors.toList());
		
		System.out.println(sortedEmployee);
		
		List<Employee> sortedEmployee2= Employee.getEmployees().stream()
				.sorted(Comparator.comparing(Employee :: getMarks)).collect(Collectors.toList());
		
		System.out.println(sortedEmployee2);
		
		
		//without comparator
		List<Employee> sortedEmployee3= Employee.getEmployees().stream()
				.sorted((e1,e2)->e1.getMarks().compareTo(e2.getMarks())).collect(Collectors.toList());
		
		System.out.println(sortedEmployee3);
		
		List<Employee> sortedEmployee4= Employee.getEmployees().stream()
				.sorted((e1,e2)-> -new Integer(e1.getName().length()).compareTo(e2.getName().length())).collect(Collectors.toList());
		
		System.out.println(sortedEmployee4);
	}

}
