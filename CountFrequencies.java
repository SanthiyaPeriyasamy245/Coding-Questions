class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        
      int[]count=new int[arr.length+1];
      List<Integer>ans=new ArrayList<>();
      Arrays.fill(count,0);
      for(int x:arr)
      {
          count[x]++;
      }
      for(int i=1;i<count.length;i++)
      {
        ans.add(count[i]);    
      }
      return ans;
    }
}