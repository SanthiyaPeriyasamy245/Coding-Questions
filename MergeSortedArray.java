class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[]ans=new int[m+n];
         while(i<m && j<n && k<m+n)
         {
            if(nums1[i]<nums2[j])
            {
                ans[k]=nums1[i];
                i++;
                k++;
            }
            else{
                ans[k]=nums2[j];
                j++;
                k++;
            }

            
         }
         
         while(i<m)
         {
            ans[k]=nums1[i];
            k++;
            i++;
         }
         while(j<n)
         {
            ans[k]=nums2[j];
            k++;
            j++;
         }
       for(int idx=0;idx<nums1.length;idx++)
       {
        nums1[idx]=ans[idx];
       }

    }
}