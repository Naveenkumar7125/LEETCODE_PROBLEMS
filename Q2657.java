class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int freq1[] = new int[len];
        int res[] = new int[len];
        int count = 0;
        for(int i=0;i<len;i++)
        {
            freq1[A[i]-1]++;
            if(freq1[A[i]-1]>=2)count++;
            freq1[B[i]-1]++;
            if(freq1[B[i]-1]>=2)count++;
            res[i] = count;
            
        }
        return res;
    }
}