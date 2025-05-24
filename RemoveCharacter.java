
class RemoveCharacter {
    static String removeChars(String str1, String str2) {
        // code here
        
      
        int[]arr=new int[26];
        
        
        for(char c:str2.toCharArray())
        {
            arr[c-'a']=1;
        }
        String answer=" ";
        for(char c:str1.toCharArray())
        {
            if(arr[c-'a']==0)
            {
                answer+=c;
            }
        }
        return answer;
    }
}