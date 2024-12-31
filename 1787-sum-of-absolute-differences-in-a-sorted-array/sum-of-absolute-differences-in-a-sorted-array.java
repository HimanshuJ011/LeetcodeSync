class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        int sum=0, leftSum=0, leftNum=0;

        for(int ele : nums) sum+=ele;
    
        for(int i=0; i<nums.length; i++){
            int rightSum = sum-leftSum-nums[i];
            int rightNum = n-1-leftNum;
            ans[i] = (leftNum*nums[i]-leftSum)+(rightSum - rightNum*nums[i]);
            leftNum++;
            leftSum+=nums[i];
        }
        return ans;
    }
}