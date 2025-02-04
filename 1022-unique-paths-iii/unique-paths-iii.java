class Solution {

    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0, endX = 0, endY = 0;
        int walkableCells = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 2) {
                    endX = i;
                    endY = j;
                } else if (grid[i][j] == 0) {
                    walkableCells++;
                }
            }
        }
        int paths = solve(grid, startX, startY, endX, endY, walkableCells);
        return paths;
    }

    private int solve(int[][] board, int i, int j, int endX, int endY, int walkableCells) {
        int n = board.length;
        int m = board[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] == -1) {
            return 0;
        }
        if (i == endX && j == endY) {
            if (walkableCells == 0) {
                return 1;
            }
        }
        int count = 0;

        board[i][j] = -1;

        count += solve(board, i, j + 1, endX, endY, walkableCells-1);
        count += solve(board, i + 1, j, endX, endY, walkableCells-1);
        count += solve(board, i, j - 1, endX, endY, walkableCells-1);
        count += solve(board, i - 1, j, endX, endY, walkableCells-1);

        board[i][j] = 0;
        return count;
    }
}
