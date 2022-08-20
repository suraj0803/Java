package company;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	ArrayList<Company> cc1 = Create.build();
	ArrayList<Company> cc2 = Create.filter(cc1);
	
	for(Company cc3 : cc2) {
		System.out.println(cc3);
	}
}
	
}
