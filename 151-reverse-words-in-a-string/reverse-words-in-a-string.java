class Solution {

    public String reverseWords(String s) {
        if(s.length()==0) return "";
        s = s.trim();
        Stack<String> st = new Stack<>();
        int i = 0;
        StringBuilder word = new StringBuilder();

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                if (word.length() != 0) {
                    st.push(word.toString());
                }
                word.delete(0, word.length());
            } else {
                word.append(s.charAt(i));
            }
            i++;
        }

        st.push(word.toString());

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
