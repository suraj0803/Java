package com.in.task1;

import java.util.ArrayList;

public class Create {
	static ArrayList<Employee> build() {
		Employee e1 = new Employee("Kuldeep",24,"Allahabad");
		Employee e2 = new Employee("Rahul",21,"Pune");
		Employee e3 = new Employee("Akshay",25,"Aligarh");
		Employee e4 = new Employee("Prabahv",30,"Andaman");
		Employee e5 = new Employee("Golu",55,"Bihar");
		
		ArrayList<Employee> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		
		return e;		
	}
	static ArrayList<Employee> filter(ArrayList<Employee> e){
		ArrayList<Employee> e1 = new ArrayList<>();
		for(Employee e2 : e) {
			if(e2.age>30){
			e1.add(e2);
		}
	}
		return e1;
		
	}
}
