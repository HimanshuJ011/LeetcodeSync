class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int ind, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            backtrack(arr, ind, target - arr[ind], ds, ans);
            ds.remove(ds.size()-1);
        }
        backtrack(arr, ind + 1, target, ds, ans);
    }
}
