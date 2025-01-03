class Solution {

    public int maxScore(String s) {
        int sumOne = 0, sumZero = 0, ans = Integer.MIN_VALUE, ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') sumOne++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') sumZero++; else ones++;
            ans = Math.max(ans, (sumZero + (sumOne - ones)));
        }
        return ans;
    }
}
