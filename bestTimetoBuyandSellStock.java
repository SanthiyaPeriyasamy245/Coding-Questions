class Solution {
    public int maxProfit(int[] prices) {
        int minstock=prices[0];
        int profit=0;
        int i=1;
        while(i<prices.length)
        {
            if(prices[i]<minstock)
            {
                minstock=prices[i];
            }
           
           else if(prices[i]>minstock)
           {
            int crntprofit=prices[i]-minstock;
            
            profit=crntprofit>profit?crntprofit:profit;
           }
            i++;
        }

  return profit;
      
    }
}