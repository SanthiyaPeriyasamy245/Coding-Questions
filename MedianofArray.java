class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[]ans=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j] )
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
        while(i<nums1.length)
        {
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            ans[k]=nums2[j];
            j++;
            k++;
        }
        int mid=ans.length/2;
        if(ans.length%2!=0)
        {
            return (double)(ans[ans.length/2]);
        }
        else
        {
            return (double)((ans[mid]+ans[mid-1]))/2;
        }
    }
}