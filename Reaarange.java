class Reaarange {
    public int[] rearrangeArray(int[] nums) {

        int[]numscopy=new int[nums.length];
        int j=0;
        int k=1;
        for(int x:nums)
        {
            if(x<0)
            {
             numscopy[k]=x;
             k+=2;   
            }
            else{
                numscopy[j]=x;
                j+=2;
            }
        }
     
    return numscopy;
    }
}