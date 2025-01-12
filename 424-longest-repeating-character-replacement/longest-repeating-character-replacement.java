class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int maxLen = 0, l=0, r=0, maxF=0;
        int n = s.length();

        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxF= Math.max(maxF, hash[s.charAt(r)-'A']);

            if((r-l+1) - maxF > k){
                hash[s.charAt(l)-'A']--;
                l++;
            }

            if((r-l+1) - maxF <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }

            r++;
        }

        return maxLen;

    }
}