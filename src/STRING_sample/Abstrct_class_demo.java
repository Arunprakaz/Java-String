package STRING_sample;

import javax.swing.DefaultBoundedRangeModel;

public abstract class Abstrct_class_demo {

	public  abstract int A1();	
	public Abstrct_class_demo() {
		System.out.println("Abstract class allow contructor");
	}
	
	{
		System.out.println("intializwer");
	}
	static final void B1(){
		System.out.println("Abstract class allow final");

		
	} 
	static {
		System.out.println("Abstract class allow static method ");
		int b =11;
		//return b;
	}
	
	public static int c= 12;
	public final int a=10;
	
	public static  class childclass extends Abstrct_class_demo {

		@Override
		public int A1() {
		//	this.a=10;
			return 10;
		}
		
		
		public static void main(String[] args) {
			
			Abstrct_class_demo as=new childclass();
			System.out.println(as.A1());
		}
		
	}
	
	
	//public static abstract void A1();
	//public final abstract void A1();
	
}
