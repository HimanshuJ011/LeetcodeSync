class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(1, n, k, ans, new ArrayList<>());

        return ans;
    }

    private void backTrack(int ind, int n, int k, List<List<Integer>> ans, List<Integer> ds) {
        if (ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i <= n; i++) {
            ds.add(i);
            backTrack(i + 1, n, k, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
