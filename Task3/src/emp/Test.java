package emp;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		ArrayList<Employee> e2 = Create.build();
		ArrayList<Employee> e3 = Create.filter(e2);
		
		for(Employee e4 : e3) {
			System.out.println(e4);
		}
		
	}
}
