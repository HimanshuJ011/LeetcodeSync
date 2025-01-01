class Solution {

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] prefixSum = new int[security.length];
        int[] suffixSum = new int[security.length];

        for (int i = 1; i < security.length - time; i++) {
            if (security[i] <= security[i - 1]) {
                prefixSum[i] = 1 + prefixSum[i - 1];
            }
        }
        for (int i = security.length - 2; i >= time; i--) {
            if (security[i] <= security[i + 1]) {
                suffixSum[i] = 1 + suffixSum[i+1];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=time; i<security.length-time; i++){
            if(suffixSum[i]>=time && prefixSum[i]>=time){
                ans.add(i);
            }
        }
        return ans;
    }
}
