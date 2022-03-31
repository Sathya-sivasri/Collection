package oopsconcepts;

public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.d);
		b.printNumeber();
		System.out.println("b="+b.b+" c="+b.c);
		b.display();
		

	}
//SINGLE LEVEL INHERITANCE
}
class A{
	int b=30;  
	int c=40;
    void display() {
    	System.out.println("b="+b+"  c="+c);
    }
}
class B extends A{
	int d=50;
	void printNumeber() {
		System.out.println("d="+d);
	}

}