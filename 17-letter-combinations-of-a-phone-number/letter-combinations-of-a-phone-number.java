class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        pad("", digits, mapping, ans);
        return ans;
    }

    private void pad(String p, String up, String[] mapping, List<String> ans) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String chars = mapping[digit];

        for (char ch : chars.toCharArray()) {
            pad(p + ch, up.substring(1), mapping, ans);
        }
    }
}
