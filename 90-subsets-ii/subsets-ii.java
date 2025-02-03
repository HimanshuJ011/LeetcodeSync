class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrackWithSet(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackWithSet(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // if (result.contains(current)) return;

        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length; i++) {
            if(i>index && arr[i] == arr[i-1]) continue;
            current.add(arr[i]);
            backtrackWithSet(arr, i + 1, current, result);
            current.removeLast();
        }
    }
}
