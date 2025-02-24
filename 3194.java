class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            min = Math.min(min, (double)(nums[r] + nums[l])/2);
            l++;
            r--;
        }
        return min;
    }
}
