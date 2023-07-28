package STRING_sample;

public class Armstrong_number {
	public static void main(String[] args) {

		int num = 371;
		int actualnum = num;
		double result = 0;

		while (actualnum != 0) {
		int n = actualnum % 10;
		System.out.println("n----"+n);
	result = result + Math.pow(n, 3);
		System.out.println("result----"+result);
		System.out.println("actual number before ----"+actualnum );
		actualnum = actualnum / 10;
		System.out.println("actual number after ----"+actualnum);
	
		}

		if (result == num) {
		System.out.println(num + " is an Armstrong number");
		} else {
		System.out.println(num + " is not an Armstrong number");
		}

		}

		

}
