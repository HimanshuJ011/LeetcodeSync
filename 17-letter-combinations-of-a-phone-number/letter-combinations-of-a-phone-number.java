class Solution {

    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        return pad("", digits);
    }

    private List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        int end = (digit * 3) - 3;
        int start = (digit - 2) * 3;

        if (digit == 7) {
            end = (digit * 3) - 3 + 1;
        }
        if (digit == 9) {
            start = (digit - 2) * 3 + 1;
            end = (digit * 3) - 3 + 2;
        }
        if (digit == 8) {
            start = (digit - 2) * 3 + 1;
            end = (digit * 3) - 3 + 1;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad(p + ch, up.substring(1)));
        }
        return list;
    }
}
