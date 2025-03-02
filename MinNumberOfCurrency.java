

/*
 
  Given an amount, find the minimum number of notes of different denominations that sum up to the given amount. Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount. We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1} 
Examples:  

Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1

Input : 2456
Output : Currency  Count
         2000 : 1
         200 : 2
         50 : 1
         5 : 1
         1 : 1
  */
 
public class MinNumberOfCurrency {

	
	public static void main(String[]args)
	{
		int count=0;
		int amount=22551;
		int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];
        
        for(int i=0;i<9;i++)
        {
        	if(amount>=notes[i])
        	{
        		count+=amount/notes[i];
        		amount=amount%notes[i];
        	}
        	
        }
//        for each and every note type we can use that notecount array
//        for(int x:noteCounter)
//        {
//        	if(x!=0)
//        	{
//        		count+=x;
//        	}
//        }
        System.out.println(count +" Notes ");
	}
}
