class Solution {
    public int subarraySum(int[] nums) {
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        for(int i=1;i<nums.length;i++)
            {
                pre[i] = pre[i-1] + nums[i];
            }
        int count = 0;
        for(int i=0;i<nums.length;i++)
            {
                int start = Math.max(0, i - nums[i]);
                if(start!=0)
                count += pre[i] - pre[start-1];
                else 
                {
                    count += pre[i];
                }
            }
        return count;
    }
}