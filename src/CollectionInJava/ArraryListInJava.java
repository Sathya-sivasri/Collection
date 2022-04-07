package CollectionInJava;

import java.util.ArrayList;

public class ArraryListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al2=new ArrayList();
		al2.add("java");
		al2.add("c#");
		al2.add(20.20f);
		
		ArrayList al3=new ArrayList();//change it for git hub
		al3.add("java");
		al3.add("c#");
		al3.add(20.20f);
		
		
		//ArrayList al=new ArrayList();
		//al.add(20);
		//al.add(20.3f);
		//al.add("shree");
		//al.add(20);
		//al.add(20.3f);
		//al.add(null);
		//al.add(1, 20.20f);//index
		//al.addAll(al2);
		//OR
		ArrayList<String> al=new ArrayList<String>();
		al.add("Siva");
		al.add("Sri");
		al.add("SSS");
		for(String S:al) {
			System.out.println(S);
		}
		System.out.println(al);
		//System.out.println(al.get(2));
		//for(Object element:al) {//object is a class
		//	System.out.println(element);//element is a variable give anyting. its variable 
		//}
		
	}

}
