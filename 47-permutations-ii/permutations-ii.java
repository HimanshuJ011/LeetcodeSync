class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        backtrack(nums, 0, ans);
        return new ArrayList<>(ans);
    }
     private void backtrack(int[] arr, int ind, Set<List<Integer>> ans) {
        if (ind == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                temp.add(arr[i]);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind; i < arr.length; i++){
            swap(i,ind,arr);
            backtrack(arr, ind+1, ans);
            swap(i,ind,arr);
        }
    }
    private void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}