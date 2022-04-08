package CollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer, String> map=new HashMap<>();
		HashMap<String,String> map=new HashMap();
		map.put("100", "sathya");
		map.put("101", "Sri");
		map.put("103", "Tom");
		map.put("104", "senthil");
		System.out.println(map);
		System.out.println(map.get(101));
		System.out.println(map.containsKey(101));
		System.out.println(map.containsValue("Tom"));
		for(Map.Entry<String,String> entry: map.entrySet()) {
			System.out.print("Key= "+entry.getKey());
			System.out.print("Value= "+entry.getValue());
			System.out.println();
		}
		
for(String id:map.keySet()) {
	System.out.println("id= " +id+ "value= "+map.get(id));
}
for(String name:map.values()) {
	System.out.println(name);
}
	}

}
