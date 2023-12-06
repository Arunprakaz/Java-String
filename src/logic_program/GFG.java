package logic_program;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class GFG {

	static Integer[] a = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };

	// Driver Code
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(a);

		// Function call
		sortBasedOnFrequencyAndValue(list);
	}

	// Compare Function
	public static void sortBasedOnFrequencyAndValue(List<Integer> list)
	{
		int n = a.length;
		final HashMap<Integer, Integer> mapCount= new HashMap<Integer, Integer>();
		final HashMap<Integer, Integer> mapIndex= new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (mapCount.containsKey(a[i])) {
				mapCount.put(a[i],mapCount.get(a[i]) + 1);
			}
			else {
				mapCount.put(a[i],1);
				System.out.println("mapCount.put(a[i],1)--"+mapCount.put(a[i],1));// Map to capture Count of elements
				mapIndex.put(a[i],i);
				System.out.println("	mapIndex.put(a[i],i)--"+	mapIndex.put(a[i],i));// Map to capture 1st
								
				// occurrence of elements
			}
		}

		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer n1, Integer n2)
			{
				System.out.print(" "+n1+n2);
				int freq1 = mapCount.get(n1);
				int freq2 = mapCount.get(n2);
				if (freq1 != freq2) {
					return freq2 - freq1;
				}
				else {
					return mapIndex.get(n1)- mapIndex.get(n2); // Elements with Lesser
								// Index gets Higher
								// Priority
				}
			}
		});
		System.out.println(list);
	}
}
