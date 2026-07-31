class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] ans = new int[n];

        for (int j = 0; j < n; j++) {
            int col = j;

            for (int i = 0; i < m; i++) {
                int nextCol = col + grid[i][col];

                if (nextCol < 0 || nextCol >= n) {
                    col = -1;
                    break;
                }

                if (grid[i][col] != grid[i][nextCol]) {
                    col = -1;
                    break;
                }

              
                col = nextCol;
            }

            ans[j] = col;
        }

        return ans;
    }
}