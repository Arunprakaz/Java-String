package collection;

import java.util.HashMap;
import java.util.Set;

public class map_concept {

	public static void main(String[] args) {
		
		HashMap map =new HashMap(); 
		map.put(1, "arun");
		map.put("lusu", 2);
		map.put("3", 234);
		map.put("4", "prakash");
		System.out.println("map without wrapper class"+map+'\n');

		HashMap<String,Integer> map1 =new HashMap(); 
		map1.put("arun", 1);
		map1.put("lusu", 5);
		map1.put("lusu1", 3);
		map1.put("lusu2", 4);
		System.err.println("map1 with wrapper class"+map1+'\n');

		boolean containsKey = map.containsKey(map1);
		System.out.println("map.containsKey(map1)--"+containsKey+"\n");

		boolean containsValue = map.containsValue(map1);
		System.out.println("map.containsValue(map1)--"+containsValue+'\n');

		System.out.println("map.isEmpty()--"+map.isEmpty()+'\n');

		System.out.println("map.size()--"+map.size()+'\n');

		System.out.println("map.get(map1)--"+map.get(1)+'\n');

		System.out.println("map.keySet()--"+map.keySet()+'\n');

		System.out.println("map.values()--"+map.values()+'\n');

		// using for-each loop for iteration over Map.entrySet() 

		int count=0;
		String s="";
		Set<String> set = map1.keySet();
		for (String a : set) {
			System.out.println("map.values()--"+map1.get(a)+'\n');
			if (map1.get(a) > count ) {
				count = map1.get(a);
				s=a;
			}
		}
		System.out.println("a--"+s+"  count--"+count);
	}
}
