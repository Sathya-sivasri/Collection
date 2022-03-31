
public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo md=new MethodDemo();
		int result=md.addTwoNumber(50, 50);
		System.out.println("addition result is ="+result);
		int result1=md.multy(5, 5);
		System.out.println("mutiplication result1 is ="+result1);

	}

}
class MethodDemo{
	int addTwoNumber(int a, int b) {
		int c=a+b;
		return c;
	}
	int multy(int a, int b) {
		int c=a*b;
		return c;
	}
	//inside the class we can add many methods. 
	
	
}