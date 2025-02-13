class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int num : nums) 
        {
            q.add((long)num);
        }
        int c = 0;
        while (q.size()>=2 && q.peek() < k)
        {
            long num1 = q.poll();
            long num2 = q.poll();
            long res = num1 * 2 + num2;
            
            q.offer(res);
            c++;
        }
        return c;
    }
}
