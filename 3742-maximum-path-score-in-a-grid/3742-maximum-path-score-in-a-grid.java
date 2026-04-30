class Solution {
    int m, n;
    Integer[][][] dp;

    public int maxPathScore(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        dp = new Integer[m][n][k + 1];

        int ans = dfs(0, 0, grid, k);
        return ans < 0 ? -1 : ans;
    }

    int dfs(int i, int j, int[][] grid, int k) {
        // ❌ out of bounds or cost exceeded
        if (i >= m || j >= n || k < 0) return -1;

        int val = grid[i][j];

        // 🔥 reduce cost FIRST
        int newK = k;
        if (val > 0) newK--;

        // ❌ if cost exceeded, stop immediately
        if (newK < 0) return -1;

        // ✅ destination
        if (i == m - 1 && j == n - 1) {
            return val;
        }

        // ✅ memo
        if (dp[i][j][k] != null) return dp[i][j][k];

        int right = dfs(i, j + 1, grid, newK);
        int down = dfs(i + 1, j, grid, newK);

        // ❌ no valid path
        if (right == -1 && down == -1) {
            return dp[i][j][k] = -1;
        }

        // ✅ take best path
        return dp[i][j][k] = val + Math.max(right, down);
    }
}