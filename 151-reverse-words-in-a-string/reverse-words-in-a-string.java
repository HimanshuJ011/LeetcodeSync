class Solution {

    public String reverseWords(String s) {
        s = s.trim();
        Stack<String> st = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                if (sb.length() != 0) {
                    st.push(sb.toString());
                }
                sb.delete(0, sb.length());
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        
        st.push(sb.toString());

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
