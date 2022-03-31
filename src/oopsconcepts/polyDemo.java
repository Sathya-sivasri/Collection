package oopsconcepts;
//Method overloading
public class polyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyDemo p= new polyDemo();
		//p.add(10, 20);or sop
		System.out.println(p.add(10, 20));
		System.out.println(p.add(2.2f, 5.5f));
		
	

	}
	int add(int a, int b) {
		return(a+b);
	}
	int add(int a, int b, int c) {
		return(a+b+c);
	}
	float add(float a, float b) {
		return(a+b);
	}
	float add(float a, float b, float c) {
		return(a+b+c);
	}

}
