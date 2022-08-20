package com.in.task1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> e3 = Create.build();
		ArrayList<Employee> e4 = Create.filter(e3);
		
		for(Employee e5 : e4) {
			System.out.println(e5);
		}
		
	}
}
