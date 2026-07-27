class Solution {
    public void gameOfLife(int[][] board) {
         int rows = board.length;
        int cols = board[0].length;

         int[][] next = new int[rows][cols];

        int[][] dir = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1}, {1,0}, {1,1}
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int live = 0;

                for (int[] d : dir) {

                    int nr = i + d[0];
                    int nc = j + d[1];

                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols) {

                        live += board[nr][nc];
                    }
                }

                
                if (board[i][j] == 1) {

                  
                    if (live == 2 || live == 3) {
                        next[i][j] = 1;
                    }

                  
                    else {
                        next[i][j] = 0;
                    }

                } else {

                    if (live == 3) {
                        next[i][j] = 1;
                    }

                  
                    else {
                        next[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = next[i][j];
            }
        }
    }
}