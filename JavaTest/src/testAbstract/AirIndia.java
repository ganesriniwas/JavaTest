package testAbstract;

public class AirIndia extends parentFlight {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("Method is implemented in AirIndia-----------------");
		System.out.println("Air India will have Red and White color combination");
	}

	public static void main(String[] args) {
		AirIndia AI = new AirIndia();
		parentFlight PF = new AirIndia();
		AI.getEngine();
		AI.getWings();
		AI.getColor();
		System.out.println("------------------------------");
		PF.getColor();
	}
}
