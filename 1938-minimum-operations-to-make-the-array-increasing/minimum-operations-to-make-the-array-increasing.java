class Solution {

    public int minOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int incr = 0;

            if (nums[i] >= nums[i + 1]) {
                incr = nums[i]+1;
                count+=incr - nums[i+1];
                nums[i+1] = incr;
            }
        }
        return count;
    }
}
