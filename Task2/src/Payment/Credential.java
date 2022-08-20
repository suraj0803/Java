package Payment;

public class Credential {
	public String uname;
	public String password;
	@Override
	public String toString() {
		return "Credential [uname=" + uname + ", password=" + password + "]";
	}
	public Credential(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
