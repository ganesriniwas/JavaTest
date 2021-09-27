package testInheritance;

import java.util.ArrayList;

class class_Sub extends class_Super {
	int i;
	static ArrayList<String> as = new ArrayList<String>();

	class_Sub() {
		i = 2;
	}

	void method(int am) {
		System.out.println("Sub Class method " + am);
	}

	public static void main(String[] args) {
		class_Sub sub = new class_Sub();
		System.out.println(sub.i);
		sub.super_method();
		sub.method();
		as.add("ABC");
		as.add(1, "CBA");
		as.remove(0);
		try {
			System.out.println(as.get(6));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("exception");
		}
		
		finally {
			System.out.println("finally printed");
		}
		System.out.println("Within");	
		
	}

}
