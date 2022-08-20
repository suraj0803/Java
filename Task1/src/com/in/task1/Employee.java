package com.in.task1;

public class Employee {
	public String name;
	public int age;
	public String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
}
