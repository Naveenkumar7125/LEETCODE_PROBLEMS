class Solution {
    public int maxOperations(int[] nums) {
        int count = 1;
        int len = nums.length;
        int sum = nums[0] + nums[1];
        for(int i=2;i<len-1;i+=2)
        {
            if((nums[i]+nums[i+1])==sum)count++;
            else break;
        }
        return count;
    }
}
