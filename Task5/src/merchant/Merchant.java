package merchant;
import java.util.*;

public class Merchant {
	public static void main(String[] args) {
		HashMap<Integer,HashMap<String,ArrayList<ArrayList<String>>>> hm = new HashMap<>();
		
		HashMap<String, ArrayList<ArrayList<String>>> hm1 = new HashMap<>();
		ArrayList<String> emp1 = new ArrayList<>();
		emp1.add("kuldeep");
		emp1.add("Akshay");
		emp1.add("Rahul");
		
		ArrayList<String> emp2 = new ArrayList<>();
		emp2.add("Prabhav");
		emp2.add("Golu");
		emp2.add("Siddharth");
		
		ArrayList<ArrayList<String>> college = new ArrayList<>();
		college.add(emp1);
		college.add(emp2);
		
		hm1.put("Amity University", college);
		
		hm.put(0001, hm1);
		
		for(Integer key : hm.keySet()) {
			HashMap<String,ArrayList<ArrayList<String>>>innerhm = hm.get(key);
			for(String m1 : innerhm.keySet()) {
				System.out.println(key);
				ArrayList<ArrayList<String>> mm = hm.get(key).get(m1);
				System.out.println(m1);
				for(ArrayList<String> m2 : mm) {
					for(String m3 : m2) {
						System.out.println(m3+" ");
					}
					System.out.println();
				}
			}
		}
		
	}
}
