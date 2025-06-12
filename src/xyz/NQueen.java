package xyz;

public class NQueen {
    private int N;

    public NQueen(int N) {
        this.N = N;
    }

    // Utility function to print the board
    private void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : "- ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Utility function to check if a queen can be placed on board[row][col]
    private boolean isSafe(int[][] board, int row, int col) {
        // Check this row on left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Recursive utility function to solve N Queen problem
    private boolean solveNQUtil(int[][] board, int col) {
        // Base case: If all queens are placed
        if (col >= N) {
            return true;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place the rest of the queens
                if (solveNQUtil(board, col + 1)) {
                    return true;
                }

                // If placing queen in board[i][col] doesn't lead to a solution, remove queen (backtrack)
                board[i][col] = 0;
            }
        }

        // If the queen can not be placed in any row in this column col, then return false
        return false;
    }

    // Function to solve the N Queen problem using Backtracking
    public void solveNQ() {
        int[][] board = new int[N][N];

        // Initialize the board to 0
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }

        // Solve the N Queen problem
        if (solveNQUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    public static void main(String[] args) {
        int N = 4; // You can change this value to test with different sizes
        NQueen queen = new NQueen(N);
        queen.solveNQ();
    }
}

