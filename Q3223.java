class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i=0;i<26;i++)
        {
   
            if(freq[i]<=2)count+=freq[i];
            else
            {
                if(freq[i]%2==0)count+=2;
                else count+=1;
            }
        }
        return count;
    }
}