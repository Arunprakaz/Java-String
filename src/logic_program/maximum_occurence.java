package logic_program;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class maximum_occurence {

	public static void main(String[] args) {

		int s[]= {1,3,2,1,2,3,2,3,4,5,5,4,4,4,4};
		Arrays.sort(s);
		for (int i = s.length-1; i >0; i--) {
			System.out.print(" "+s[i]);
		}
		System.out.println();
		TreeMap<Integer,Integer> map= new TreeMap<>();
		for (int j = 0; j < s.length; j++) {
			if (map.containsKey(s[j])) {
				map.put(s[j],map.get(s[j])+1);
			} else {
				map.put(s[j], 1);
			} 
		}
		System.out.println(map);
		Set<Integer> keySet = map.keySet();

		Collection<Integer> values = map.values();
		int max=0;
		for (Integer integer : values) {
			if (integer>max) {
				max=integer;
			}

		}
		System.out.println("max value--"+max);
	}

}
