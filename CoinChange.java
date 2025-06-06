class CoinChange {
    public int count(int coins[], int sum) {
        
        int[][]dp=new int[coins.length][sum+1];
        for(int[]x:dp)
        {
            Arrays.fill(x,-1);
        }
        return countWays(coins.length-1,sum,coins,dp);
        
    }
    public static int countWays(int index,int sum,int[]coins,int[][]dp)
    {
        if(index==0)
        {
            return sum%coins[index]==0?1:0;
        }
        if(dp[index][sum]!=-1)
        {
            return dp[index][sum];
        }
        int notTake=countWays(index-1,sum,coins,dp);
        int take=0;
        if(coins[index]<=sum)
        {
            take=countWays(index,sum-coins[index],coins,dp);
            
        }
        return dp[index][sum]=notTake+take;
    }
}