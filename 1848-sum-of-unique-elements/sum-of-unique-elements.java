class Solution {

    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];

        for (int ele : nums) {
            map[ele]++;
        }
        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
