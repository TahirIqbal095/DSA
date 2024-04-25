package hashtables;

public class ValidSuduko {
    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidBox(board, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                int num = board[row][i] - '0';
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    public static boolean isValidColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                int num = board[i][col] - '0';
                if (seen[num - 1]) {
                    return false;
                }
                seen[num - 1] = true;
            }
        }
        return true;
    }

    public static boolean isValidBox(char[][] board, int box) {
        boolean[] seen = new boolean[9];
        int startRow = (box / 3) * 3;
        int startCol = (box % 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (seen[num - 1]) {
                        return false;
                    }
                    seen[num - 1] = true;
                }
            }
        }
        return true;
    }
}