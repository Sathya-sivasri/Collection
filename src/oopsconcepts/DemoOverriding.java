package oopsconcepts;

public class DemoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l=new Loan();
		l.calInterestRate();
		CarLoan carl=new CarLoan();
		carl.calInterestRate();
		HomeLoan hl=new HomeLoan();
		hl.calInterestRate();
		EducationLoan el=new EducationLoan();
		el.calInterestRate();	
}

}
class Loan{
	int calInterestRate(){
	System.out.println("Calculate Loan Amont Based on Income");
	System.out.println();
		return 0;
	}
}
class CarLoan extends Loan{
	int calInterestRate() {
		int interestrate=3;
		System.out.println("Car loan Interest Rate is"  +interestrate+ "%");
		System.out.println();
		return interestrate;
		
	}
}
class HomeLoan extends Loan{
	int calInterestRate() {
		int interestrate=4;
		System.out.println("Home Loan Interest Rate is" +interestrate+ "%");
		System.out.println();
		return interestrate;
	}
}
class EducationLoan extends Loan{
	int calInterestRate() {
		int interestrate=2;
		System.out.println("EducationLoan Interest Rate is"  +interestrate+  "%");
		System.out.println();
		return interestrate;
	}
}
