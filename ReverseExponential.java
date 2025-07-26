class ReverseExponential {
    public int reverseExponentiation(int n) {
        // code here
        
        if(n<0)
        {
            n=n*(-1);
        }
        int rev=reverse(n);
        
        int ans=1;
        
        while(rev!=0)
        {
            if(rev%2==1)
            {
                ans=ans*n;
                rev-=1;
            }
            else{
                n=n*n;
                rev=rev/2;
            }
        }
        
        
    return ans;
   
   
    }
    public  int reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum*10+(n%10);
            n=n/10;
        }
        return sum;
    }
}
