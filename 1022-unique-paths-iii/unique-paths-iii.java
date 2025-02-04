class Solution {

    public int uniquePathsIII(int[][] grid) {
        int[] points = findPoints(grid);
        int startX = points[0], startY = points[1], endX = points[2], endY = points[3];
        int walkableCells = points[4];
        int paths = solve(grid, startX, startY, endX, endY, walkableCells, 1);
        return paths;
    }

    private int solve(int[][] board, int i, int j, int endX, int endY, int walkableCells, int visitedCount) {
        int n = board.length;
        int m = board[0].length;

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] == -1) {
            return 0;
        }
        if (i == endX && j == endY) {
            if (visitedCount == walkableCells) {
                return 1;
            }
        }
        int count = 0;

        board[i][j] = -1;

        count += solve(board, i, j + 1, endX, endY, walkableCells, visitedCount + 1);
        count += solve(board, i + 1, j, endX, endY, walkableCells, visitedCount + 1);
        count += solve(board, i, j - 1, endX, endY, walkableCells, visitedCount + 1);
        count += solve(board, i - 1, j, endX, endY, walkableCells, visitedCount + 1);

        board[i][j] = 0;
        return count;
    }

    private int[] findPoints(int[][] grid) {
        int[] arr = new int[5];
        int walkableCells = 0;
        boolean foundStart = false, foundEnd = false;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !foundStart) {
                    arr[0] = i;
                    arr[1] = j;
                    foundStart = true;
                } else if (grid[i][j] == 2 && !foundEnd) {
                    arr[2] = i;
                    arr[3] = j;
                    foundEnd = true;
                }
                if (grid[i][j] != -1) {
                    walkableCells++;
                }
            }
        }
        arr[4] = walkableCells;
        return arr;
    }
}
