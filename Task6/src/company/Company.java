package company;

public class Company {
	public String name;
	public int year;
	public int emp_count;
	public Landline lanline;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEmp_count() {
		return emp_count;
	}
	public void setEmp_count(int emp_count) {
		this.emp_count = emp_count;
	}
	public Landline getLanline() {
		return lanline;
	}
	public void setLanline(Landline lanline) {
		this.lanline = lanline;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", year=" + year + ", emp_count=" + emp_count + ", lanline=" + lanline + "]";
	}
	public Company(String name, int year, int emp_count, Landline lanline) {
		super();
		this.name = name;
		this.year = year;
		this.emp_count = emp_count;
		this.lanline = lanline;
	}
	
	
}
