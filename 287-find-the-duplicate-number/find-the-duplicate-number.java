class Solution {

    public int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int num = nums[i];

            if ((num - 1 != i)) {
                if(nums[num-1] == nums[i]) return nums[num-1];
                
                int temp = nums[num - 1];
                nums[num - 1] = num;
                nums[i] = temp;
            }else{
                i++;
            }
        }
        return nums[i];
    }
}
