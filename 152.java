class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        if(nums.length==1)return nums[0];
        int leftproduct = 1;
        int rightproduct = 1;
        for(int i=0;i<nums.length;i++)
        {
            leftproduct *= nums[i];
            rightproduct *= nums[nums.length-i-1];
            max = Math.max(max, Math.max(leftproduct, rightproduct));
            if(leftproduct == 0 )leftproduct = 1;
            if(rightproduct == 0 )rightproduct = 1;
        }
        return max;
        
    }
}
