package STRING_sample;

import java.util.HashMap;

public class wissen {

	public static void main(String[] args) throas {+
		char[] s=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for (char c : s) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
