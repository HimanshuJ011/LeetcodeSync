class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;

        while (right < n) {
            while (left < right && set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
