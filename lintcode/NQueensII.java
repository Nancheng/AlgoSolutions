/*
 * Follow up for N-Queens problem.

Now, instead outputting board configurations, 
return the total number of distinct solutions.

Example
For n=4, there are 2 distinct solutions.
 */
public class NQueensII {

    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
    int result = 0;

    public int totalNQueens(int n) {
        int[] board = new int[n];
        dfs(board, 0);
        return result;
    }

    public void dfs(int[] board, int row) {
        if (row == board.length) {
            result++;
            return;
        }
        for (int col = 0; col < board.length; ++col) {
            if (canPlace(board, row, col)) {
                board[row] = col;
                dfs(board, row + 1);
                board[row] = 0;
            }
        }
    }
    
    public boolean canPlace(int[] board, int row, int col) {
        for (int i = 0; i < row; ++i) {
            if (board[i] == col || 
                    Math.abs(row - i) == Math.abs(col - board[i])) {
                return false;
            }
        }
        return true;
    }

}
