import java.util.* ;
import java.io.*; 
public class IntersectionOfArrays
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer>ans=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<n && j<m)
		{
			int val1=arr1.get(i);
			int val2=arr2.get(j);
			if(val1==val2)
			{
				ans.add(val1);
				i++;
				j++;
			}
			else if(arr1.get(i)<arr2.get(j))
			{
				i++;
			}
			else{
				j++;
			}

		}
		return ans;
	}
}
