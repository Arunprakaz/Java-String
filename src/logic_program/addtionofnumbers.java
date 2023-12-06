package logic_program;

public class addtionofnumbers {
	// static int sum =0;
	public static int  addnum(int a) {

		if (a !=0) {
		
			return a%10+addnum(a/10);
		}
		else {
			return 0;
		}
		
		 
		
	}
	public static void main(String[] args) {
		
		int a=1001;
		System.out.println("totalsumof digit--"+addnum(a));
	}

	
	
	
	
}
