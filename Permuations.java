/*

              permute("", "abc")
                 |
          +------+------+
         a              b              c
       /    \        /    \        /    \
     bc      cb    ac     ca     ab     ba
   /    \    /  \   /  \   /  \    /   \   /  \
 abc    acb  bac bca cab  cba abc  acb  bac  bca
 
 */
import java.util.*;

public class Permuations{
    public static void main(String[]args)
    {
       String str="abc";
       String p="";
       generatePermutations(p,str);
        
    }
    public static void  generatePermutations(String p,String str)
    {
        if(str.isEmpty())
        {
            System.out.println(p);
            return;
        }
        for(int i=0;i<str.length();i++)
        
        {
            char c=str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            generatePermutations(p+c,remaining);
        }
       
    }
}