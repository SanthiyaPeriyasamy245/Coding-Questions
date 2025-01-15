class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]ans=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(check(numbers,i,ans,target-numbers[i]))
            {
                return ans;
            }
        }
     return ans;  
     
    }
    public static boolean check(int[]arr,int j,int[]ans,int srch)
    {
        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]==srch)
            {
                ans[0]=j+1;
                ans[1]=i+1;
                return true;
            }
        }
        return false;
    }
}