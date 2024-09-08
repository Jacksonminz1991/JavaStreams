package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> manipulatedList = new ArrayList<String>();
		list = Arrays.asList("Jackson","Abhineet", "Minz", "Agnes","Aloka","Minz" );
		
		list.forEach(System.out::println);
		
		manipulatedList = list.stream().filter(o -> o.startsWith("J")).collect(Collectors.toList());
		System.out.println("=============Starts with J ===================");
		manipulatedList.forEach(System.out::println);
		
		manipulatedList.clear();
		manipulatedList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("=============Distinct===================");
		manipulatedList.forEach(System.out::println);
		
		manipulatedList.clear();
		manipulatedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("=============Sorted===================");
		manipulatedList.forEach(System.out::println);
		
	}

}
