class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("", n, result);
        return result;
    }

    private void solve(String s, int n, List<String> result) {
        if (s.length() == 2 * n) {
            if (isValid(s)) {
                result.add(s);
            }
            return;
        }

        s += '(';
        solve(s, n, result);

        s = s.substring(0, s.length() - 1);

        s += ')';
        solve(s, n, result);
    }

    private boolean isValid(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') sum++; else sum--;
            if (sum < 0) return false;
        }
        return sum == 0;
    }
}
