import java.util.*;

/*
 
Leaders in an Array
Given an array of integers, print all the leaders in the array.
 A leader is an element that is greater than all the elements to its right. 
 The output should be in the same order as they occur in the input array.

Example Input: [16, 17, 5, 1, 2]
Example Output: 17 5 2
 
 */



public class LeadersInArray {

	public static void main(String[] args) {
		
		int[]arr= {16, 17, 5, 1, 2};
		
		int max=Integer.MIN_VALUE;
		Stack<Integer>ans=new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>max)
			{
				ans.push(arr[i]);
				max=arr[i];
			}
		}
		
		int[]answer=new int[ans.size()];
		for(int i=0;i<answer.length;i++)
		{
			answer[i]=ans.pop();
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
