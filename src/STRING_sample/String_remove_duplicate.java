package STRING_sample;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_remove_duplicate {


			static String removeDuplicate(char str[], int n)
			{
				// Used as index in the modified string
				int index = 0;

				// Traverse through all characters
				for (int i = 0; i < n; i++)
				{

					// Check if str[i] is present before it
					int j;
					for (j = 0; j < i; j++)
					{
					//	System.out.println("Str[i]  "+i+" --"+str[i]+"  Str[j]--"+j+"  "+str[j]);
						if (str[i] == str[j])
						{
							System.out.println("Str[i]  "+i+" --"+str[i]+"  Str[j]--"+j+"  "+str[j]);
							break;
						}
					}

					// If not present, then add it to
					// result.
					if (j == i)
					{
						str[index++] = str[i];
					}
				}
				return String.valueOf(Arrays.copyOf(str, index));
			}

			// Driver code
			public static void main(String[] args)
			{
//				char str[] = "geeksforgeeks".toCharArray();
//				int n = str.length;
//				System.out.println(removeDuplicate(str,n));
				
					int a[] = {5,2,6,8,6,7,5,2,8};
					Arrays.sort(a);
					System.out.println("aaaaa0---"+a[0]);
//					int length = a.length;
//				String str="arunprakash";
					// Function call
//					setmethod(str);
					
					
			}
			
		public static void setmethod(String a) {

			
				Set<Character> set
					= new LinkedHashSet<>();

				// adding elements to LinkedHashSet
				for (int i = 0; i < a.length(); i++)
					set.add(a.charAt(i));

				// Print the elements of LinkedHashSet
				System.out.print(set);
				System.out.println();
				for (Character character : set) {
					System.out.print(character);
					
				}
			}

			// Driver code
		}
		
		
			



		// This code is contributed by Rajput-Ji

	

