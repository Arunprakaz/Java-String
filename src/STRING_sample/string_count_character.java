package STRING_sample;

import java.util.HashMap;

public class string_count_character {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="arunprakash";
count(str);
		
	}

	public static  void count(String str) {
		char[] character=str.toCharArray();
		System.out.println(character.length);
		for (char c : character) {
		
			System.out.print(""+ c);
		}

		HashMap<Character, Integer> count_char = new HashMap<>();
		for (char cha : character) {
			System.out.println("character iteration----"+cha);
			if (count_char.containsKey(cha)) {
				count_char.put(cha, count_char.get(cha)+1);
				System.out.println("output--"+count_char.get(cha));
			
			} else {
count_char.put(cha, 1);
			}
		}
		System.out.println("hashmap"+count_char);
	}

}
