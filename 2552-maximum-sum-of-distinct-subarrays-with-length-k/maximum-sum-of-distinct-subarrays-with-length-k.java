class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0, r=0;
        int n = nums.length;
        long result=0, sum=0;
        Set<Integer> set = new HashSet<>();

        while(r<n){
            int num = nums[r];

            while(set.contains(num)){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            sum+=num;
            set.add(num);

            if(r-l+1 == k){
                result = Math.max(result,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }

        return result;
    }
}