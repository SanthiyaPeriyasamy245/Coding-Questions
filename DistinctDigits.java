// User function Template for Java

class DistinctDigits {
    public int[] common_digits(int[] nums) {
       
       int[]digits=new int[10];
       for(int x:nums)
       {
           while(x!=0)
           {
              int rem=x%10;
              digits[rem]=1;
              x=x/10;
           }
       }
       List<Integer>ans=new ArrayList<>();
       for(int i=0;i<digits.length;i++)
       {
           if(digits[i]==1)
           {
           ans.add(i);
           }
       }
       int[]arr=new int[ans.size()];
       int j=0;
       for(Integer y:ans)
       {
           arr[j]=y;
           j++;
       }
       return arr;
       
    }
}