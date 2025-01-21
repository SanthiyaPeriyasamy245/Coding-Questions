class Solution {
    public int getSecondLargest(int[] arr) {

        int max=0;
        int sndmax=-1;
       for(int i=0;i<arr.length;i++)
       {
       
        if(arr[i]>max)
        {
            if(max!=0)
            {
            sndmax=max;
            }
            max=arr[i];
        }
         else if(arr[i]<max && arr[i]>sndmax)
        {
            sndmax=arr[i];
        }
    }
      
       return sndmax;
        
    }
}