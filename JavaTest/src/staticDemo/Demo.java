package staticDemo;

public class Demo {

	int a;
	int b;
	final static int conts=10;
	static int demoCount = 0; //class variable

	public Demo(int a, int b) {
		this.a = a;
		this.b = b;
		demoCount++;
	}
	public void printCount() {
		System.out.println("count of object:" + conts);
	}
	public static void main(String[] args) {
		Demo d1 = new Demo(0, 1);
		d1.printCount();
		Demo d2 = new Demo(2, 3);
		d2.printCount();
		Demo d3 = new Demo(4, 5);
		d3.printCount();
		//Demo.printCount();
	}

}
