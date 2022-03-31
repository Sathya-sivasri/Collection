package StringInJava;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java Welcome";
		StringBuffer sb=new StringBuffer("Hello Java Welcome");
		StringBuilder sb3=new StringBuilder("non-synchronized");
		//System.out.println(s);
		//System.out.println("String s="+s);
		//System.out.println("sb="+sb);
		
		s.concat("to the class");
		
		System.out.println(s);
		sb.append("to the java class");
		System.out.println("String s= "+s);
		System.out.println("SB="+sb);
		
		String s1=new String();
		String s2=new String("hello java");
		String s3=new String(sb);//string buffer
		//System.out.println("s3="+s3);
		String s4=new String(sb3);//string builder
		
		char ch[]= {'a','b','c','d'};//char to string 
		String s5 =new String(ch);
		System.out.println("s5="+s5);
		
		byte b[]= {65,66,67,68};//byte to string
		String s6=new String(b);
		System.out.println("s6="+s6);
		
		
		

	}

}
