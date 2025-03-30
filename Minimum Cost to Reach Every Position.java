class Solution {
    public int[] minCosts(int[] cost) {
        int res[] = new int[cost.length];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<cost.length;i++)
            {
                if(cost[i]<min)min = cost[i];
                res[i] = min;
            }
        return res;
    }
}