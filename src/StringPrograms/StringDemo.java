package StringPrograms;

import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Java# /is a/ simple #Language";
		String s1="Java is a simple Language";
		String s3="Java is a OOP Language";
		
		System.out.println(s.charAt(3));
		System.out.println(s);
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 13));
		System.out.println(s.contains(s1));//true or false
		System.out.println(s.equals(s1));
		System.out.println(s==s3);
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s.isEmpty());
		System.out.println(s1.isBlank());
		String s4=s.concat(s3);
		System.out.println(s4);
		System.out.println(s.replace('a','f'));
		System.out.println(s.replace("Java", "C"));
		
		String straArr[]=s.split("/");
		for(int i=0; i<straArr.length;i++) {
			System.out.println(straArr[i]);
		}
		System.out.println(s.indexOf('#'));
		System.out.println(s.indexOf('#',7));
		System.out.println(s1.toUpperCase());
	} 

}
