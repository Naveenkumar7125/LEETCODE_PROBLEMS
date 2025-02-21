class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)odd.add(nums[i]);
            else even.add(nums[i]);
        }
        int res[] = new int[odd.size() + even.size()];
        int k = 0;
        for(int i=0;i<even.size();i++)
        {
            res[k++] = even.get(i);
        }
        for(int i=0;i<odd.size();i++)
        {
            res[k++] = odd.get(i);
        }
        
        return res;
    }
}
