package testInheritance;

import java.util.HashMap;
import java.util.Set;

public class hashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Apple");
		hm.put(1, "Banana");
		hm.put(2, "Chicken");
		hm.put(3, "Apple");
		hm.put(5, "Strawberry");
		System.out.println(hm.get(2));
		Set s = hm.entrySet();
		System.out.println(s);

	}

}
