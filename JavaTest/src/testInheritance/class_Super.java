package testInheritance;

public class class_Super {
	int i;
	public class_Super() {
		i=1;
	}
	public static void method() {
		System.out.println("Super Class method");
	}

	void super_method() {
		method();
		System.out.println("Super Class method-2");
	}
}
