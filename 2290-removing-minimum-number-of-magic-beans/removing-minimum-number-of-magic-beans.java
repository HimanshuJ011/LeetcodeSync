class Solution {

    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long preSum = 0;
        for (int bean : beans) preSum += bean;
        long ans = Long.MAX_VALUE;
        long j = beans.length;
        for (int i = 0; i < beans.length; i++, j--) {
            ans = Math.min(ans, preSum - j * beans[i]);
        }
        return ans;
    }
}
