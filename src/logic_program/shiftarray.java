package logic_program;

import java.util.ArrayList;

public class shiftarray {

	public static void main(String[] args) {
		int a[] ={1,3,4,5,6};

		ArrayList<Integer>  b= new ArrayList<>();

		int left_shift = 4;
		int  N=a.length;	
		//		3 4 5 6 1
		//		4 5 6 1 3 
		
		for (int i=left_shift-1;i<N-1;i++){
			b.add(a[i+1]) ; 
		}
		for (int i = 0; i < left_shift; i++) {
			b.add(a[i]);	
		}
			
		System.out.println(b);
	}

}
