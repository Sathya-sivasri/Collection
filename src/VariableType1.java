
public class VariableType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo.m1();
		System.out.println(VariableDemo.b);
		//VariableDemo v=new VariableDemo();
		
		

	}

}
class VariableDemo{
	int a=10;
	static int b=20;
	
	static void m1() {
		VariableDemo v=new VariableDemo();
		System.out.println("a="+v.a);
		System.out.println("b="+b);
		System.out.println("This is Static Method");
	}
	void m2() {
		System.out.println("This is instance Method");
	}
	
}