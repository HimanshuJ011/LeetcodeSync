class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftSum=0, rightSum=0;
        int sum=0, maxi=0;

        for(int i=0; i<k; i++){
            leftSum+=cardPoints[i];
        }
        maxi = leftSum;
        int right = cardPoints.length-1;

        for(int i=k-1; i>=0; i--){
            leftSum -= cardPoints[i];
            rightSum +=cardPoints[right];
            right-=1;
            maxi = Math.max(leftSum+rightSum, maxi);
        }

        return maxi;

    }
}