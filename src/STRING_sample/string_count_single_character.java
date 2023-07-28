package STRING_sample;
import java.util.Scanner;

class string_count_single_character {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter text----");
		String str = s.nextLine();

		System.out.println("entered text----->"+str);
		string_count_single_character obj = new string_count_single_character(str);
		//obj.string_reverse(str);
		obj.string_character_count(str);

	}

	public void string_reverse(String str) {
		System.out.println("str.length()"+str.length()); 

		String[] str1 = str.split("");


		for (int i = str1.length - 1; i >= 0; i--) {
			System.out.print(str1[i]);


		} 

	}

	public string_count_single_character(String str) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) !=' ') {
				count++;
			}	
		}
		System.out.println("Total Letter ="+count);
	}



	public void string_character_count(String str) {
		char ch = 'e';
		//character to look for occurrences is e
	
		int count = 0; 
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == ch) 
			{
				count++;
			}
		}
		System.out.println("The character '" + ch + "' appears " + count + " times in the given string '" + str + "'.");
	}




}





