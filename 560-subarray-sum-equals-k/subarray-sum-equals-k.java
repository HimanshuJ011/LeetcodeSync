class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int ele : nums) {
            preSum += ele;
            count += map.getOrDefault(preSum - k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}