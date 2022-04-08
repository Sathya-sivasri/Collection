package inheritanceInJava;

public class HierarchialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println("a=" +b.a+"  b=" +b.b);
		b.display();
		b.show();
		C c=new C();
		System.out.println("c=" +c.a+ " c="+c.c);
		c.printNumber();
		c.display();
		
//if we create object of parent class only access parent class method and variables		
		A a =new A();
		System.out.println("a=" + a.a);
		a.display();
	
	}

}
class A{
	int a=50;
void display() {
	System.out.println("This is display method of Class A");
}
}
class B extends A{
	int b=60;
	void show() {
//you can access var/me from parent class without creating a object		
		System.out.println("a=+a");
		display();
		System.out.println("This is show Method of Class B");
	}

}
class C extends A{
	int c=70;
	void printNumber() {
		System.out.println("This is printNumber Method of Class C");
	}
	
}

class D extends A{
	int c=70;
	void printNumber() {
		System.out.println("This is printNumber Method of Class D");
	}
	
}
