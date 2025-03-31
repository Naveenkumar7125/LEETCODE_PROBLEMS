class Solution {
    public String toGoatLatin(String s) {
        
        String vowels = "AEIOUaeiou";
        String arr[] = s.split(" ");
        
        String ans = "";
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i].charAt(0);
            
            StringBuilder r = vowels.indexOf(c)!=-1 ? new StringBuilder(arr[i]) : new StringBuilder(arr[i].substring(1));
            if(vowels.indexOf(c)!=-1)
            {
                r = r.append("ma").append("a".repeat(i+1));
                
            }
            else 
            {
                r = r.append(arr[i].charAt(0)).append("ma").append("a".repeat(i+1));
                
            }
            ans += r;
            if(i!=arr.length-1)
                ans += " ";
            
        
        }
       
        
        return ans;
    }
}