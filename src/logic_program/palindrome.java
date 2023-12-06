package logic_program;

import java.util.*;

public class palindrome {
	public static void main (String[] args) {
		String original, reverse = "";
	Scanner in = new Scanner(System.in);
		int length;
		System.out.println("Enter the number or String");
		original = in.nextLine();
		length = original.length();
		for (int i =length-1; i>=0; i--) {
			System.out.println(original.charAt(i));
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse is:" +reverse);
		
		if(original.equals(reverse)) {
			System.out.println("The number is palindrome");}
		else {
			System.out.println("The number is  not 7=palindrome");
		}	
		}
}
