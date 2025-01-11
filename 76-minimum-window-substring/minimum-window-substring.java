class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int n = s.length(); int m =  t.length();
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int index = -1;
        int cnt = t.length();

        int[] map = new int[128];
        for (char c : t.toCharArray()) map[c]++;

        while(r<n){
            if(map[s.charAt(r++)]-- > 0){
                cnt--;
            }

            while (cnt == 0){
                if(r-l < minLen){
                    minLen = r-l;
                    index = l;
                }

                if(map[s.charAt(l++)]++ == 0) cnt++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(index, index + minLen);

    }
}