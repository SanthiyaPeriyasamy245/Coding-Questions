
class PrimeSum {
    static String isSumOfTwo(int N) {
        // code here
        int num1=0;
        int num2=0;
        int i=1;
        int j=N;
        
        for(i=1;i<j;i++)
        {
            if(isprime(i) && isprime(j-i) && ((i+(j-i))==N))
            {
                return "Yes";
            }
        }
        return"No";
        
       
    }
    static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
         if(n%i==0)
         {
             return false;
         }
        }
        return true;
    }
}