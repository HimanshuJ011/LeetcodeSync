class Solution {

    public int minTimeToType(String word) {
        int size = 26;
        char currChar = 'a';
        int count = 0;

        for (char ch : word.toCharArray()) {
            int move = Math.abs(ch - currChar);
            if (move > size / 2) {
                move = size - move;
            }
            count+=move+1;
            currChar = ch;
        }
        return count;
    }
}
