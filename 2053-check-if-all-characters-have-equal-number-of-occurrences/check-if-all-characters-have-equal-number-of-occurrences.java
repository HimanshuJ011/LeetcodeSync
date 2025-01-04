class Solution {

    public boolean areOccurrencesEqual(String s) {
        int[] nmap = new int[26];
        int target = 0;
        for (char ch : s.toCharArray()) {
            nmap[ch - 'a']++;
        }
        for (int i = 0; i < nmap.length; i++) {
            if (nmap[i] > 0) {
                target = nmap[i];
                break;
            }
        }
        for (int ele : nmap) {
            if (ele > 0 && ele != target) {
                return false;
            }
        }

        return true;
    }
}
