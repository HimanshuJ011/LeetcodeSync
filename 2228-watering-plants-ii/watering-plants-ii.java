class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0, right = plants.length-1;
        int count = 0;
        int cA = capacityA, cB = capacityB;

        while(left<=right){
            if(left == right){
                if(plants[left]<= cA || plants[right] <= cB) break;
                else count++;
                break;
            }
            if(cA < plants[left]){
                count++;
                cA = capacityA;
            }
            cA-=plants[left];
            left++;
     
            if(cB < plants[right]){
                count++;
                cB = capacityB;
            }
            cB-=plants[right];
            right--; 
          
        }
        return count;
    }
}