package WrapperClasses;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;//primitive datatype
		Integer i1=new Integer(i);
		System.out.println(i1);
		int i3=i1.intValue();//object into primitive
		
		float f=1.2f;
		Float f1=new Float(f);
		float f2=f1.floatValue();//object to primitive
		System.out.println(f1);
		

	}

}
