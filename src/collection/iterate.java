package collection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class iterate {

	public static void main(String[] args) {

		String s="am1 in2 my3 Bangalore4";
		char a[]=s.toCharArray();
		
		for (char c : a) {
		if (Character.isDigit(c)) {
			System.out.print(c);
		}
				
		}
		System.out.println();
		for (char q : a) {
		if (Character.isAlphabetic(q)) {
			System.out.print(q);
			
			
			URL a=new URL(s);
			HttpURLConnection h= (HttpURLConnection)a;
			h.connect();
			h.getResponseCode();
		}
	}
	}
}
