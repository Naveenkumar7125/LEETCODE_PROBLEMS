class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for(int i=0;i<hours.length;i++)
        {
            res += (hours[i] >= target) ? 1 : 0;
        }
        return res;
    }
}
