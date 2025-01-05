class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>();
        for (int freq : map.values()) {
            if (!frequencies.add(freq)) {
                return false;
            }
        }
        return true;
    }
}
