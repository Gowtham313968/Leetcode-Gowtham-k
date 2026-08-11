// Last updated: 8/11/2026, 2:17:31 PM
class Solution {
    private int rows, cols;
    private int result = 0;

    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int startX = 0, startY = 0;
        int emptyCells = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != -1) {
                    emptyCells++;
                }
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }

        dfs(grid, startX, startY, emptyCells);
        return result;
    }

    private void dfs(int[][] grid, int x, int y, int remain) {
        if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == -1) {
            return;
        }

        if (grid[x][y] == 2) {
            if (remain == 1) {
                result++;
            }
            return;
        }

        int temp = grid[x][y];
        grid[x][y] = -1; // mark visited

        dfs(grid, x + 1, y, remain - 1);
        dfs(grid, x - 1, y, remain - 1);
        dfs(grid, x, y + 1, remain - 1);
        dfs(grid, x, y - 1, remain - 1);

        grid[x][y] = temp; // backtrack
    }
}