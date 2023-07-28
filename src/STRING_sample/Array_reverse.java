package STRING_sample;

public class Array_reverse {

	public static void main(String[] args) {
		char[] c= {'r','e','x','v','g','s','d'};
		int left =0;
		int right=c.length-1;
		char rev = 0;
		
		while (left<right) {
			rev =c[left];
			c[left]=c[right];
			c[right]= rev;
		
			left++;
			right--;
		}
		System.out.print("reversed array==");
		for (char d : c) {
			System.out.print(" "+d);
		}
	} 
	}


