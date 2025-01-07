class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            int val = map.getOrDefault(n,0);
            sum+=val;
            map.put(n,val+1);
        }
        return sum;
    }
}