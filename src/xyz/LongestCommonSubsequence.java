package xyz;

public class LongestCommonSubsequence {

    // Function to find the length of LCS
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store lengths of longest common subsequence
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array in bottom-up fashion
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp[m][n] contains the length of LCS for s1[0..m-1], s2[0..n-1]
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int length = lcs(s1, s2);
        System.out.println("Length of LCS: " + length);
    }
}
