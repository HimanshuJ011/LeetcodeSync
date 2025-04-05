class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1, left = 0, right = 0, ans = 0;

        while(right < nums.length){
            prod*=nums[right];

            while(prod >= k && left<=right){
                prod/=nums[left++];
            }
            ans+=right-left+1;
            right++;
        }
        return ans;

    }
}