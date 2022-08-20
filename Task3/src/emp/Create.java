package emp;

import java.util.ArrayList;

public class Create {
	static ArrayList<Employee> build(){
		Employee e1 = new Employee("101","kuldeep","Manager",70000);
		Employee e2 = new Employee("102","Rahul","Developer",80000);
		Employee e3 = new Employee("103","Akshay","Software Engineer",60000);
		Employee e4 = new Employee("104","Prabhav","Director",90000);
		Employee e5 = new Employee("105","Siddharth","Tester",50000);
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		
		return emp;	
	}
	
	static ArrayList<Employee> filter(ArrayList<Employee> emp){
		ArrayList<Employee> ee = new ArrayList<>();
		for(Employee eee : emp) {
			if(eee.desg.equals("Developers")) {
				ee.add(eee);
			}
		}
		return ee;
		
	}
}
