class Solution {

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        while(k>0){
            int item = nums[nums.length-1];
            count+=item;
            item+=1;
            nums[nums.length-1] = item;
            k--;
        }
        return count;

    }
}
