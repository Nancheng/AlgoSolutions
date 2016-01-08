/*
 * Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

Have you met this question in a real interview? Yes
Example
For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note
m and n will be at most 100.
 */
public class UniquePathsII {

    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; ++i) {
            for (int j = 0; j < obstacleGrid[0].length; ++j) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (i > 0 && j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

}
