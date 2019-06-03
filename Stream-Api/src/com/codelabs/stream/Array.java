package com.codelabs.stream;

public class Array {
	
	public static void main(String[] args) {
		
		//method reference
		Employee[] employee= Employee.getEmployees().stream().toArray(Employee[] ::new);
	}

}
