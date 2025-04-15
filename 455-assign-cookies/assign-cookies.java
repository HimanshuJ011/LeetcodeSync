class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int l=0, r=0,count=0;

        while(l < s.length && r < g.length){
            if(g[r]<=s[l]){
                r++;
                count++;
                l++;
            }else{
                l++;
            }
        }
     
        return count;
    }
}