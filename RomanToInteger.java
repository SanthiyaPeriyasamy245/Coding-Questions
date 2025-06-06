// User function Template for Java

class RomanToInteger {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        
        int sum=get_value(s.charAt(s.length()-1));
        for(int i=0;i<s.length()-1;i++)
        {
            int number=get_value(s.charAt(i));
            if(get_value(s.charAt(i))<get_value(s.charAt(i+1)))
            {
                sum=sum-number;
            }
            else
            {
                sum=sum+number;
            }
            
        }
        return sum;
    }
    public static int get_value(char c)
    {
        
            if(c=='I'){
                return 1;
            }
            else if(c=='V')
            {
               return 5;
            }
            else if(c=='X')
            {
                return 10;
            }
            else if(c=='L')
            {
                return 50;
            }
            else if(c=='C')
            {
                return 100;
            }
            else if(c=='D')
            {
                return 500;
            }
            else if(c=='M')
            {
                return 1000;
            }
            return -1;
    }
}