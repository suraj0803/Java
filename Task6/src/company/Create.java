package company;
import java.util.*;

public class Create {
	static ArrayList<Company> build(){
		Company c1 = new Company("TSYS", 1970, 6000, new Landline("91", "98", "76"));
		Company c2 = new Company("TCS", 1960, 16000, new Landline("96", "18", "36"));
		Company c3 = new Company("TOSHIBA", 1975, 5000, new Landline("99", "78", "66"));
		
		ArrayList<Company> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		return c;
		
	}
	
	static ArrayList<Company> filter(ArrayList<Company> c){
		ArrayList<Company> cc = new ArrayList<>();
		for(Company ccc : c) {
			if(ccc.lanline.country_code.equals("91")){
				cc.add(ccc);
			}
		}
		return cc;
		
	}
}
