package xyz;

import java.util.Arrays;

public class RotateMatrix {
    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotate(int[][] mat) {
        int N = mat.length;

        // Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                // Swap mat[i][j] with mat[j][i]
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < N; i++) {
            int low = 0, high = N - 1;
            while (low < high) {
                // Swap mat[i][low] with mat[i][high]
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        rotate(mat);

        System.out.println("\nMatrix After 90° Clockwise Rotation:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
