class Solution {

    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            char ch1 = s.charAt(i), ch2 = s.charAt(i + 1), ch3 = s.charAt(i + 2);
            if (ch1 == ch2 || ch1 == ch3 || ch2 == ch3) {
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
