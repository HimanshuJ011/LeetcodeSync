class Solution {

    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        int[] ans = new int[heights.length];
        int index = ans.length-1;

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] >= st.peek()) {
                count++;
                st.pop();
            }
            ans[index--] = st.isEmpty() ? count : count + 1;
            
            count = 0;
            st.push(heights[i]);
        }
        return ans;
    }
}
