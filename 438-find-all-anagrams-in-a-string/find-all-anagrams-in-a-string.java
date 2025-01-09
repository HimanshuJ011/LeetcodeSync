class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() == 0 || s == null || s.length()<p.length()) return list;

        int[] freq = new int[26];
        int l = 0, r = 0, count = p.length();

        for (char ch : p.toCharArray()) {
            freq[ch-'a']++;
        }
        while (r < s.length()) {
            if(freq[s.charAt(r++) - 'a']-- >= 1) count--;
            if(count == 0) list.add(l);
            if(r - l == p.length() && freq[s.charAt(l++)-'a']++ >=0) count++ ;

        }
        return list;
    }
}