package logic_program;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class sum {

	public static void main(String[] args) {
		
		String s="hai i am arunprakash how are you";
		//output = hai are am arunprakash how i you;
		
		//oddpostion or rreversed;
		
		
		String reverse="";
		
		String[] split = s.split(" ");
		for (int j = 0; j<split.length; j++) {
		
		if (j%2==0) {
			System.out.print(split[j]+" ");
			
		} else {
			System.out.print(split[split.length-j-1]+" ");
		}	
			
		}
		
		
		
		
		
		
		
		
		
//		//OUTPUT=24681357;
//
//		int a=12345678;
//int num=a;
//int sum=0,odd=0;
//
//TreeSet<Integer> l= new TreeSet();
//		while(num!=0){
//	int digit	= num%10;
//	l.add(digit);
//		num=num/10;
//		}
//		System.out.println(l);
//		
//for (Integer integer : l) {
//	if (integer%2==0) {
//		sum=(sum*10)+integer;
//		//System.out.println(sum);
//	}else {
//		odd=(odd*10)+integer;
//	}
//	
//	
//	
//}
//System.out.print(sum);
//System.out.print(odd);	 
	}

}
