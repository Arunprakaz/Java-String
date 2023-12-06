package STRING_sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class code {
	public static void main(String[] args) {


		int[] a={2,3,4,5,35,9,9,6,7};
		Set<Integer> b= new TreeSet<>();
		int n= a.length-1;
		for (int i : a) {
			System.out.print(i+" ");
			b.add(i);
		}
		Object[] array = b.toArray();
		System.err.println(array[n-3]);
		System.out.println();
		System.out.println(b);
		int count=0;
		for (Integer integer : b) {
			++count;
			if (count==b.size()-2) {
				System.out.println(integer);
			}
		}
	}}
