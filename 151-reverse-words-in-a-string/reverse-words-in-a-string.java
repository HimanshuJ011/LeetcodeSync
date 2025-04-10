class Solution {

    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        // String[] words = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(words));
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (word.length() != 0) {
                    ans.append(word.reverse());
                    ans.append(' ');
                    word.delete(0, word.length());
                }
            } else {
                word.append(ch);
            }
        }
        ans.append(word.reverse());
        return ans.toString().trim();
    }
}
