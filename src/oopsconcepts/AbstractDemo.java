package oopsconcepts;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 k=new S1();
		k.display();
		k.show();
		k.print();	
	}

}
abstract class S{
//abstract class have non.ab,ab method 
	void display() {
		System.out.println("This is display method");
	}
//constructor. can have same class name with parameter
	S(){
		System.out.println("this is constrctor");
	}
//without body is ab.method
	abstract void show();
	abstract void print();
}
//if ab.class extends implementation happen in child class method{}
class S1 extends S{
	void show() {
		System.out.println("this is abstract implementation show method");
	}
	void print() {
		System.out.println("this is abstract implementaion print method");
	}
}
	
