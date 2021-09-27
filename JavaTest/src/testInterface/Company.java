package testInterface;

import testInheritance.class_Super;

public class Company implements Employe, Employer  {

	@Override
	public void getEmployerName() {
		// TODO Auto-generated method stub
		System.out.println("Employer Name");
	}

	@Override
	public void getEmployeName() {
		// TODO Auto-generated method stub
		System.out.println("Employe Name");
	}

	public void getCompanyName() {
		System.out.println("Company Name");
	}

	public static void main(String args[]) {
		Employe emp = new Company();
		Employer empr = new Company();
		Company cmp = new Company();
		emp.getEmployeName();
		empr.getEmployerName();
		System.out.println("------------------caling through Company Class------------------");
		cmp.getCompanyName();
		cmp.getEmployerName();
		cmp.getEmployeName();
		class_Super cs = new class_Super();
	}
}
