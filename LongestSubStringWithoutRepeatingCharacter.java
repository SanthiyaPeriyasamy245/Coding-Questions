class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(ans.contains(String.valueOf(s.charAt(i))))
            {
               if(ans.length()<=1)
               {
                ans=String.valueOf(s.charAt(i));
               }
               else{
                ans=ans.substring(ans.indexOf(s.charAt(i))+1)+s.charAt(i);
               }
            }
            else{
                ans=ans+s.charAt(i);
            }
           if(ans.length()>max_len)
            {
                max_len=ans.length();
            }
        }
        return max_len;
    }
}