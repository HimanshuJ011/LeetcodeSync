class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int preffixProduct = 1, suffixProduct =1;

        for (int i = 0; i < nums.length; i++) {
            if(preffixProduct == 0) preffixProduct = 1;
            if(suffixProduct == 0) suffixProduct = 1;
            preffixProduct*=nums[i];
            suffixProduct*=nums[nums.length - i -1];
            
            maxi = Math.max(maxi, Math.max(preffixProduct, suffixProduct));
        }
        return maxi;
    }
}