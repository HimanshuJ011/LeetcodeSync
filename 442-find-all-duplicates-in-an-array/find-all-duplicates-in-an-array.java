class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] map = new int[nums.length+1];
        for(int ele : nums){
            map[ele]++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<map.length; i++){
            if(map[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}