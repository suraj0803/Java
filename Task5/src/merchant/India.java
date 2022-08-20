package merchant;
import java.util.*;

public class India {
	public static void main(String[] args) {
		HashMap<String,HashMap<String,ArrayList<String>>> hm = new HashMap<>();
		
		
		ArrayList<String> Up = new ArrayList<>();
		Up.add("Lucknow");
		Up.add("Prayagraj");
		Up.add("Pratapgarh");
		
		ArrayList<String> Mh = new ArrayList<>();
		Mh.add("Pune");
		Mh.add("Thane");
		Mh.add("Mumbai");
		
		ArrayList<String> Dl = new ArrayList<>();
		
		HashMap<String,ArrayList<String>> states = new HashMap<>();
		states.put("Uttar Pradesh", Up);
		states.put("Maharastra", Mh);
		states.put("Delhi", Dl);
		
		hm.put("India", states);
		
		for(String key : hm.keySet()) {
			HashMap<String,ArrayList<String>> innerhm = hm.get(key);
			System.out.println(key);
			for(String mm : innerhm.keySet()) {
				System.out.println(mm);
				ArrayList<String> dist = hm.get(key).get(mm);
				for(String m1 : dist) {
					System.out.println(m1+" ");
				}
				System.out.println();
			}
		}
	}
}
