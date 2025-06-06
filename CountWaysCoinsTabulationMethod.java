import java.util.Arrays;

class CountWaysCoinsTabulationMethod {
    public int count(int coins[], int sum) {
        int n = coins.length;
        int[][] dp = new int[n][sum + 1];

        // Base case: fill the first row
        for (int t = 0; t <= sum; t++) {
            dp[0][t] = (t % coins[0] == 0) ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            for (int t = 0; t <= sum; t++) {
                int notTake = dp[i - 1][t];
                int take = 0;
                if (coins[i] <= t) {
                    take = dp[i][t - coins[i]];
                }
                dp[i][t] = take + notTake;
            }
        }

        return dp[n - 1][sum];
    }
}
