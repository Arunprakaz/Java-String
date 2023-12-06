package collection;

public class varhide2 extends varhide1 {
//	private int  x=110;
//	private   int  y=210;
//	public int  z=310;
	
	public static void main(String[] args) {
		varhide1 v1= new varhide1();
		varhide2 v2= new varhide2();
		varhide1 v3= new varhide2();
		
System.out.println(v1.z);
//System.out.println(v2.x);
System.out.println(v2.z);
System.out.println(v3.z);
	}
}
