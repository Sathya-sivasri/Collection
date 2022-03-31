
public class VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo1 d= new VariableDemo1();
			d.incrementByOne();
			d.printData();
		VariableDemo1 d1=new VariableDemo1();	
			d1.incrementByOne();
			d1.printData();
		VariableDemo1 d3=new VariableDemo1();
			d3.incrementByOne();
			d3.printData();
	}	
		
	}
	class VariableDemo1{
		int a=50; //instance variable inside the class outsdie the method) 
		static int b=10;  //static variable
		
		void incrementByOne(){
			a=a+1;
			b=b+1;
		}
		void printData() {
			System.out.println("a=" +a+" b=" +b);
		}
	}

//In Result instance variable increment by 1 only one time.
//but static variable everytime incrementing by 1 	