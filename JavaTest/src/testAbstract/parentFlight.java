package testAbstract;

public abstract class parentFlight {

	public void getEngine() {
		System.out.println("Engine Power should not be less than 10 bhp");
	}
	public void getWings() {
		System.out.println("Wings should not be more than 100meters");
	}
	public abstract void getColor();

}
