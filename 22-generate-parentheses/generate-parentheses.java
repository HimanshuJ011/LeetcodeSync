class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("", n, 0, 0, result);
        return result;
    }

    private void solve(String s, int n, int open, int close, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (open < n) {
            s += '(';
            solve(s, n, open + 1, close, result);
            s = s.substring(0, s.length() - 1);
        }
        if (close < open) {
            s += ')';
            solve(s, n, open, close + 1, result);
            s = s.substring(0, s.length() - 1);
        }
    }
}
