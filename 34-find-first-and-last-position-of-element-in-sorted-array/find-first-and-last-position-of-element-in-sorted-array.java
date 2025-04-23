class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = bs(nums, target, false);
        ans[1] = bs(nums, target, true);

        return ans;
    }

    private int bs(int[] nums, int target, boolean isLeft) {
        int s = 0, e = nums.length - 1, index = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isLeft) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }
}
