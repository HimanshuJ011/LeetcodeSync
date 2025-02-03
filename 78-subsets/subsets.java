class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    // private List<List<Integer>> solve(int[] arr) {
    //     List<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());

    //     for (int num : arr) {
    //         int n = outer.size();
    //         for (int i = 0; i < n; i++) {
    //             List<Integer> internal = new ArrayList<>(outer.get(i));
    //             internal.add(num);
    //             outer.add(internal);
    //         }
    //     }

    //     return outer;
    // }

    // private List<List<Integer>> solve2(int[] arr, List<List<Integer>> result, int index, List<Integer> list) {
    //     if (index == arr.length) {
    //         result.add(new ArrayList<>(list));
    //         return result;
    //     }

    //     list.add(arr[index]);
    //     solve2(arr, result, index + 1, list);

    //     list.remove(list.size() - 1);
    //     solve2(arr, result, index + 1, list);

    //     return result;
    // }

    private void backtrack(int[] arr, List<List<Integer>> result, int index, List<Integer> current) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(arr, result, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
