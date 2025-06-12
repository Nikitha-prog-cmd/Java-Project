package xyz;

import java.util.Scanner;

public class EditDistance {
    // Utility function to find the minimum of three numbers
    static int min(int x, int y, int z) {
        return Math.min(x, Math.min(y, z));
    }

    // Function to compute the Levenshtein distance
    static int computeEditDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp[][] in bottom-up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to insert all characters of second string
                if (i == 0) {
                    dp[i][j] = j; // Min. operations = j
                }
                // If second string is empty, only option is to remove all characters of first string
                else if (j == 0) {
                    dp[i][j] = i; // Min. operations = i
                }
                // If last characters are the same, ignore last character and recur for remaining substring
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If the last character is different, consider all possibilities and find the minimum
                else {
                    dp[i][j] = 1 + min(dp[i - 1][j],    // Deletion
                                       dp[i][j - 1],    // Insertion
                                       dp[i - 1][j - 1] // Substitution
                    );
                }
            }
        }

        // dp[m][n] contains the minimum edit distance
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Compute and display the edit distance
        int result = computeEditDistance(str1, str2);
        System.out.println("Minimum edit distance: " + result);
    }
}
