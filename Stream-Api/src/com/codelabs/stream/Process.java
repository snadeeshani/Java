package com.codelabs.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Process {

	public static void main(String[] args) {
		
		List<Employee> employee= Employee.getEmployees().stream()
				.map(e -> new Employee(e.getName(),e.getMarks()*2)).collect(Collectors.toList());
		
		System.out.println(employee.toString());
		
		System.out.println("---------");
		
		List<Employee> empployee2= Employee.getEmployees().stream()
				.filter(e->e.getName().contains("i"))
			.map(e -> new Employee(e.getName(),e.getMarks()*3)).collect(Collectors.toList());
		
		
		System.out.println(empployee2);
		
		
	}
}
