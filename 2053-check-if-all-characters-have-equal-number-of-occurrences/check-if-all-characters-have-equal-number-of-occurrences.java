class Solution {

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (!Objects.equals(entry.getValue(), hmap.get(s.charAt(0)))) {
                return false;
            }
        }
        return true;
    }
}
