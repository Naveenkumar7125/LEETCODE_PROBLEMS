class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0;
        int min = 101;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')white++;
            // System.out.println(white+"-||-");
        }
        if(blocks.length()==k)return white;
        for(int i=k;i<blocks.length();i++)
        {
           
            // System.out.println(min+"---");
            min = Math.min(min, white);
            // if(i>2)System.out.println("White"+white);
            if(blocks.charAt(i)=='W')white++;
            if(blocks.charAt(i-k)=='W')white--;
            // System.out.println("Updated"+white);
            
        }
        return Math.min(min, white);
    }
}
