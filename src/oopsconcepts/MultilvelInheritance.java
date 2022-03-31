package oopsconcepts;

public class MultilvelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c =new Child1();
		c.display();
		c.printNumber();
		c.show();
		System.out.println("a="+c.a+" b="+c.b+" c="+c.c );
	}

}
class Parent{
	int a =30;
	void display() {
		System.out.println("a=" +a);
	}
}
class Child extends Parent{
	int b=50;
	void printNumber() {
		System.out.println("b="+b);
	}
}
class Child1 extends Child{
	int c=50;
	void show() {
		System.out.println("c=" +c);
	}
}


