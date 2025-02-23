class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int i=0;i<hours.length;i++)
        {
            c += (hours[i] >= target) ? 1 : 0;
        }
        return c;
    }
}
