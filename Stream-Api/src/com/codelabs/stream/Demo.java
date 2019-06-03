package com.codelabs.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
			Stream.of(1,8,2,9,3).sorted().forEach(System.out ::println);
			
			System.out.println("--------------");
			Integer[] integers={5,89,156,2,1,36};
			Stream<Integer> integerStrem=Stream.of(integers);
			integerStrem.sorted().forEach(System.out ::println);
	}

}
