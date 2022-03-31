package CollectionInJava;

import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.add(20);
		ll.add(30.3f);
		ll.add("Java");
		ll.add(20);
		ll.add(null);
		System.out.println(ll);
		ll.add(3, 50);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.addAll(3, ll);
		System.out.println(ll);
		//System.out.println(ll.addFirst());

	}

}
