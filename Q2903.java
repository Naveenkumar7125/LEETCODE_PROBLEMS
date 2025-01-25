class Solution {
    public int[] findIndices(int[] nums, int id, int vd) {
        if(nums.length==1 && id==0 && vd==0)return new int[]{0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) >= vd && Math.abs(i - j) >= id) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
