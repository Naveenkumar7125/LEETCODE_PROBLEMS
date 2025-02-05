class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        char ch[] = new char[3];
        char ch1[] = new char[3];
        int count = 0;
        int k = 0, m = 0;
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            char c1 = s2.charAt(i);
            
            if(c!=c1)
            {
                count++;
                ch[k++] = c;
                ch1[m++] = c1;
            }
            if(count>2)break;
        }
        return ch[0]==ch1[1] && ch[1]==ch1[0] && count==2;
    }
}
