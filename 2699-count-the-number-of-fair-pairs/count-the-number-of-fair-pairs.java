class Solution {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = countPairs(nums, upper + 1) - countPairs(nums, lower);
        return ans;
    }

    private long countPairs(int[] nums, int value) {
        int left = 0, right = nums.length - 1;
        long result = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < value) {
                result += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
