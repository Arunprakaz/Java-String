package STRING_sample;

public class Learn_string {

	public static void main(String[] args) {
		String str="selenium webdriver";
	System.out.println("aritist-"+str.substring(9));	
		String[] s=str.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].contains("webdriver")) {
				System.out.println(s[i]);
				
			}
			
		}
 	}

}
