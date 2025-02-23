class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for(int i=0;i<hours.length;i++)
        {
            result += (hours[i] >= target) ? 1 : 0;
        }
        return result;
    }
}
