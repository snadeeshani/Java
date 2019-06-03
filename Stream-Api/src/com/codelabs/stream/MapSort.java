package com.codelabs.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSort {
	public static void main(String[] args) {
		
		Map<String, Integer> students= new HashMap<>();
		students.put("Krish",100);
		students.put("Nuwan",90);
		students.put("Bhagya",60);
		students.put("Hansi",95);
		students.put("Suranga",65);
		students.put("Erandaka",55);
		
		students.entrySet().stream().filter(e->e.getValue()>=60)
		.sorted((s1,s2)->s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList())
		.stream().forEach(s->System.out.println(s.getKey()));
		
		
		List<String> strings=new ArrayList<>();
		students.entrySet().stream().filter(e->e.getValue()>=60)
		.sorted((s1,s2)->s1.getValue().compareTo(s2.getValue()))
		.peek(s->strings.add(s.getKey())).collect(Collectors.toList());
		
		System.out.println("--------------");
		System.out.println(strings);		
				
		
		Map<Integer, String> vehicles=new HashMap<>();
		vehicles.put(10, "car");
		vehicles.put(50, "Suv");
		vehicles.put(20, "Jeep");
		vehicles.put(12, "Bus");
		vehicles.put(15, "ship");
		vehicles.put(16, "lorry");
		vehicles.put(4, "cycle");
		
		
		
				
	}
}
