class Solution {

    public List<Integer> goodIndices(int[] nums, int k) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                leftSum[i] = leftSum[i - 1] + 1;
            } else leftSum[i] = 1;
        }
        rightSum[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                rightSum[i] = rightSum[i + 1] + 1;
            } else rightSum[i] = 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = k; i < nums.length - k; i++) {
            if (rightSum[i - k] >= k && leftSum[i + k] >= k) {
                list.add(i);
            }
        }
        return list;
    }
}
