class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;

        int maxLen = Integer.MIN_VALUE;
        Set <Character> set = new HashSet<>();
        int l = 0, r=0;

        while(r<n){
            while(l<r && set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen=Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}