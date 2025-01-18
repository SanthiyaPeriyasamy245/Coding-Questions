class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max_area=0;
        while(i<j)
        {
            int area=(int)Math.min(height[i],height[j])*(j-i);
            max_area=max_area<area?area:max_area;
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return max_area;
    }
}