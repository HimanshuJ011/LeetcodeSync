class Solution {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0, ans2 = 0;

        int[] map1 = new int[101];
        int[] map2 = new int[101];

        for (int i = 0; i < nums1.length; i++) {
            map1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            map2[nums2[i]]++;
        }

        for (int i = 0; i < map1.length; i++) {
            if (map1[i] > 0 && map2[i] > 0) {
                ans1 += map1[i];
                ans2 += map2[i];
            }
        }

        return new int[] { ans1, ans2 };
    }
}
