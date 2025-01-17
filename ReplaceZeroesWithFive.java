class Solution{
	public static int convertFive(int n){
    
    int ans=0;
    int p=0;
    while(n!=0)
    {
        int rem=n%10;
        if(rem==0)
        {
            ans=ans+(5*((int)Math.pow(10,p)));
        }
        else{
            ans=ans+(rem*((int)Math.pow(10,p)));
        }
        p++;
        n=n/10;
    }
    return ans;
    }
}