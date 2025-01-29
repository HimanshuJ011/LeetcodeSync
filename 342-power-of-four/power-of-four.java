class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if (n % 4 != 0 || n <= 0) return false;
    
        return (n % 4 == 0) && isPowerOfFour(n / 4);
    }
}