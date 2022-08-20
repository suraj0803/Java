package emp;

public class Employee {
	public String name;
	public int age;
	public String loc;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", loc=" + loc + "]";
	}
	public Employee(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
	
}
