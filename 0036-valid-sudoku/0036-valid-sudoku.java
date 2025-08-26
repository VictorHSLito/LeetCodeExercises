class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROWS = board[0].length;
        int COLUMNS = board[0].length;
    
        for (int i = 0; i < ROWS; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> colms = new HashSet<>();
            Set<Character> grid = new HashSet<>();

            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] != '.') {
                    if (!rows.add(board[i][j])) return false;
                }
            }
            
            for (int k = 0; k < board.length; k++) {
                if (board[k][i] != '.') {
                    if (!colms.add(board[k][i])) return false;
                }
            }

            int rowIndex = 3 * (i / 3); 
            int colIndex = 3 * (i % 3);

            for (int l = 0; l < 9; l++) {
                char c = board[rowIndex + l/3][colIndex + l%3];
                if (c != '.') {
                    if (!grid.add(c)) return false;
                }
            }
        }
        return true;
    }
}