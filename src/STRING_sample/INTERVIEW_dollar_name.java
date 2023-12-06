package STRING_sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class INTERVIEW_dollar_name {

	public static void main(String[] args) {
	String	a="josh#2000$;nick#3000$;rose#1000$;andy#4000$;josa#5000$";
	String[] split = a.split("[#;]");
	Map<String, Integer> map= new LinkedHashMap<>();
	
	for(int i=0;i<split.length;i+=2) {
		map.put(split[i], covert_string_int(split[i+1]));
		
	}	
	Set<String> set = map.keySet();
	 map.values();
	for (String string : set) {
if (map.get(string)>2000) {
	System.out.println("greater than 2000-->"+string);
}
		
	}
	System.out.println(map);
//		String replaceAll = a.replaceAll("[#;]"," ");
//		System.out.println(replaceAll);
	}
	
	public static int covert_string_int(String s) {
		String replaceAll = s.replace("$","");
		System.out.println(replaceAll);
		int parseInt = Integer.parseInt(replaceAll);
		return parseInt;
	}

}
