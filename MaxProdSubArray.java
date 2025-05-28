class MaxProdSubArray{
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int answer=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {  
            prefix=prefix==0?1:prefix;
            suffix=suffix==0?1:suffix;
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            answer=Math.max(answer,Math.max(suffix,prefix));
        }
      
        return answer;
    }
}