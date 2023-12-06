package STRING_sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class string_functions_1 {

	public static void main(String[] args) {
		String s="josh#2000$;nick#3000$;rose#1000$;andy#4000$;josh#5000$";
		Map<String,String> m=new LinkedHashMap<>();
		String[] split = s.split(";");
		for (String string : split) {
			System.out.println(string);
		String[] str = string.split("#");
		m.put(str[0],str[1]);
		
		}
	
	System.out.println(m);
	
	
	
	}
	
	
	
	
	}


