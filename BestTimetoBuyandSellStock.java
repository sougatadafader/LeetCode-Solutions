/*200 / 200 test cases passed.
Status: Accepted
Runtime: 2 ms
Beats other java submission by 92.3*/
class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int diff= 0;
        int max_diff=0;
        int temp_diff = 0;
        int len = prices.length;
        if(len==0)
            return max_diff;
        int min=prices[0];
        for (int i=0;i<len;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }
            if(i+1< len)
            {
                 temp_diff = min-prices[i+1];
            }
            
            if(max_diff>temp_diff)
            {
                max_diff= temp_diff;
            }
        }
        
        if(max_diff<0)
            return max_diff*-1;
        else
            return max_diff;
        
        
    }
}