package testInheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class independent {
	public static void main(String args[]) {
		ArrayList<String> strA = new ArrayList<String>();
		strA.add("Apple");
		strA.add("Banana");
		strA.add("Chicken");
		strA.add("Dill pickel");
		Iterator<String> strAI = strA.iterator();
		while(strAI.hasNext()) {
			System.out.println(strAI.next());
		}
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("Apple");
		strSet.add("Banana");
		strSet.add("Chicken");
		strSet.add("Dill pickle");
		strSet.add("Chicken");
		Iterator<String> strSetI = strSet.iterator();
		System.out.println("-----------------------------------------");
		while(strSetI.hasNext()) {
			System.out.println(strSetI.next());
		}
	}
}
