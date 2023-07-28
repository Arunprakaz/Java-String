package STRING_sample;

public class Fibonacci_series {

	static public void main(String[] args)
	{
		armstrong(371);
		reverse_given_array();
		int n1=0,n2=1,sum ,count=10;
		System.out.print("fibonacci series-- "+n1+" "+n2);
		for (int i = 2; i < count; i++) {
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
		}
		
	}

	static void armstrong(int a ) {
		int num,sum = 0,d;
		num=a;
		while(num !=0) {
			d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
			
		}
		if (sum==a) {
			System.out.println("armstrong");
		}else {
			System.out.println("No armstrong");
		}
	}
static void reverse_given_array(){
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

