package STRING_sample;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class find_duplicate_character_in_string {

	public static void main(String[] args) {
		String a= "arunprakash IS a GOOD boy";
		a=a.replace(" ","");
		findduplicate(a);
	}

	static public  void findduplicate(String str)
	{
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer>HM =new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (HM.containsKey(charArray[i])) {
				HM.put(charArray[i],HM.get(charArray[i])+1);

			}
			else {
				HM.put(charArray[i],1);
			}
		}
		System.out.println("map"+HM);

		//keyset convert map keys to array of set 
		Set<Character> keySet = HM.keySet();
		System.out.println("keyset---"+keySet);
		Collection<Integer> values = HM.values();
		System.out.println("map values ----"+values);
		System.out.println(values.size());
		System.out.println(HM.size());
		System.out.println(HM.toString());
		for (char c : keySet) {
			if (HM.get(c)>1) {
				System.out.println("duplicate-----"+c+"  "+HM.get(c));
			}
		}
		System.out.println("count capital letter ");
		for (char c : keySet) {
			if (c>='A'&& c<='Z') {
				System.out.println(c+"--->"+HM.get(c));
			}
		}

	}

}
