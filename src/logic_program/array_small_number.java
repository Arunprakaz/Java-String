package logic_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class array_small_number {

	public static void main(String args[]) 
	{
		int arr1[]= {1,6,4,5,3};
		int arr2[]= {2,1,4,8,6};
		boolean nomin = true;
		int min1 = arr1[0];
		
		//1.find smallest number in 1st array [a1>a2]-- a2=a1
		//2.smallest number notpresent in 2nd array 

		// check all values in arr1
		for (int i = 0; i < arr1.length; i++) {
			// current value we're going to test
			int val = arr1[i];

			// check value if it's a _new_ minimum or we do _not_ yet have a minimum
			if ((val < min1) || nomin ) {
				// scan all elements of arr2, looking for a match to the current
				// arr1 value
				boolean match = false;
				for (int j = 0; j < arr2.length; j++) {
					match = (val == arr2[j]);
					if (match)
						break;
				}

				// if the current value is _not_ in arr2, we have a new minimum
				if (! match) {
					min1 = val;
					nomin = false;
				}
			}
		}

		if (nomin) {
			System.out.println("there are no elements in arr1 that are not in arr2\n");
		}
		else {
			System.out.println("the minimum element in arr1 not in arr2 is: %d\n"+min1);
		}


		//    return nomin;

	}
}
