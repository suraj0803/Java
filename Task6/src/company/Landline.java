package company;

public class Landline {
	public String country_code;
	public String std_code;
	public String local_no;
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getStd_code() {
		return std_code;
	}
	public void setStd_code(String std_code) {
		this.std_code = std_code;
	}
	public String getLocal_no() {
		return local_no;
	}
	public void setLocal_no(String local_no) {
		this.local_no = local_no;
	}
	@Override
	public String toString() {
		return "Landline [country_code=" + country_code + ", std_code=" + std_code + ", local_no=" + local_no + "]";
	}
	public Landline(String country_code, String std_code, String local_no) {
		super();
		this.country_code = country_code;
		this.std_code = std_code;
		this.local_no = local_no;
	}
	
	
}
