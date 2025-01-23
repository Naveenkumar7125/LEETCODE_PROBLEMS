public class Solution {
    public String reverseStr(String s, int k) {
        // StringBuilder res = new StringBuilder();
        // boolean p = true;
        // if (s.length() == 1) return s;
        // if (s.length() <= k) return reverse(s,k);
        // for (int i = 0; i < s.length(); i += k) {
        //     if (p && (s.length() - i) >= k) {
        //         res.append(reverse(s.substring(i, i + k),k));
        //     } else {
        //         res.append(s.substring(i, Math.min(i + k, s.length())));
        //     }
        //     p = !p;
        // }
        // return res.toString();
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0;i<= n-1; i +=2*k){
            if(i+k-1 <= n-1)
                reverse(i,i+k-1,str);
            else
                reverse(i,n-1,str);
        }
        String res = new String(str);
        return res;


    }

    public static void reverse(int l, int r, char[] arr) {
        while(l<=r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            r--;
            l++;
        }

    }
}

