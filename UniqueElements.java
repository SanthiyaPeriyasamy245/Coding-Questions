import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	/*  
Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct
digits that can be extracted from the numbers
of the array.
*/
	public static void main(String[]args) {
	int[]nums= {131,11,48};
	Set<Integer>set=new HashSet<>();
	
	for(int x : nums)
	{
		while(x!=0)
		{
			set.add(x%10);
			x=x/10;
		}
	}
	System.out.println(set);
	
	
}}
