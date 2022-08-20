package emp;

public class Employee {
	public String emp_code;
	public String name;
	public String desg;
	public int salary;
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_code=" + emp_code + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}
	public Employee(String emp_code, String name, String desg, int salary) {
		super();
		this.emp_code = emp_code;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	
	
}
