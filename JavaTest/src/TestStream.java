import java.util.ArrayList;
//Hello
//feature1
//v1.01
public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajay");
		names.add("Vinod");
		names.add("sachin");
		
		int d=names.stream().filter(s->s.startsWith("A")).count();
		system.out.println("Count "+d);
	}

}
