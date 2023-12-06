package STRING_sample;

import java.util.Iterator;

public class Individual_word_reverse {




	public static void main(String[] args) {
		String a="welcome to the hcl arun";
		String reverse ="";


		String[] split = a.split(" ");
		for (String string : split) {

			for (int i = string.length()-1; i >=0; i--) {
				reverse +=(string.charAt(i));	

			}
			reverse+=" "; 
		}
		System.out.println(reverse);




















		//		number divi by 2 =print first name
		//				number divi by 3 =print sec name	
		//				number dvi 2and 3 = first and second name
		//				else print number
		//			String firstname= "arun";
		//			String lastname= "prakash";
		//				for (int i = 1; i <= 100; i++) {
		//					if (i%2==0 && i%3==0) {
		//						System.out.println(firstname+" "+lastname);
		//					}else if (i%2==0 ) {
		//						System.out.println(firstname);
		//					}else if (i%3==0 ) {
		//						System.out.println(lastname);
		//					}else {
		//						System.out.println(i);
		//					}
		//					
		//				}
		//			
		//				

	}

}
