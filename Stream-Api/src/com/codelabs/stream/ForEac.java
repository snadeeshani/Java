package com.codelabs.stream;

import java.util.Comparator;
import java.util.List;

public class ForEac {

	public static void main(String[] args) {
		
		 Employee.getEmployees().stream()
				.filter(e->e.getName().length()>=5)
				.map(e->new Employee(e.getName().toUpperCase(),e.getMarks()))
				.sorted(Comparator.comparing(Employee :: getName).reversed())
				.forEach(System.out ::println);		
	}
}
