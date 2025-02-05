class Solution {

    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> store = new Stack<>();
        int count = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] >= st.peek()) {
                count++;
                st.pop();
            }
            if (!st.isEmpty()) {
                store.push(count + 1);
            } else {
                store.push(count);
            }
            count = 0;
            st.push(heights[i]);
        }
        int[] ans = new int[heights.length];
        int index = 0;
        while (!store.isEmpty()) {
            ans[index] = store.pop();
            index++;
        }
        return ans;
    }
}
