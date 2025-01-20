class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int p = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(p > prices[i])
            {
                p = prices[i];
            }
            res = Math.max(res, prices[i] - p);
        }
        return res;
    }
}