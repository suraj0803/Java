package emp;
import java.util.*;


public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee(null, 0, null);
		
		HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Kuldeep",21,"Allahabad"));
		al.add(new Employee("Rahul",22,"Palwal"));
		al.add(new Employee("Akshay",24,"Aligarh"));
		
		hm.put("Noida", al);
		
		for(String key : hm.keySet()) {
			System.out.println(key);
			ArrayList<Employee> empList = hm.get(key);
			for(Employee e : empList) {
				System.out.println(e.getName()+" "+e.getAge()+" "+e.getLoc());
			}
		}
	}
}
