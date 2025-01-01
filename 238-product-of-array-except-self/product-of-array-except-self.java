class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];

        prefixProd[0] = nums[0];
        suffixProd[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            prefixProd[i] = nums[i] * prefixProd[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProd[i] = nums[i] * suffixProd[i + 1];
        }

        int[] ans = new int[nums.length];
        ans[0] = suffixProd[1];
        for (int i = 1; i < nums.length - 1; i++) {
            ans[i] = suffixProd[i + 1] * prefixProd[i - 1];
        }
        ans[ans.length - 1] = prefixProd[prefixProd.length - 2];

        return ans;
    }
}
