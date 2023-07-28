package STRING_sample;

public class swap_two_string {

	public static void main(String[] args) {
		// Take two string s1 and s2 which we need to swap.
		
//		public String substring(int startIndex)
//		public String substring(int startIndex, int endIndex)
		
//		beginIndex :  the begin index, inclusive.
//		endIndex :  the end index, exclusive.
		
		String s1 = "Rahul"; //5
		String s2 = "Shetty";//6
		
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2;//11
		int l1 = s1.length();
		int l2 = s2.length(); //s2=6
		System.out.println("before S2 output of s1 length - s2 length ==== "+(s1.length() - s2.length()));
		
		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length()); //11-6=5 
		System.out.println("after swap s2 length ==== "+s2.length());//s2=5
		System.out.println("After S2 output of s1 length - s2 length ==== "+(s1.length() - s2.length()));
		
		s1 = s1.substring(s2.length()); //s2=5

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);

		
	}

}
