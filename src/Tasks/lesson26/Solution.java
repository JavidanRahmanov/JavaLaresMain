package Tasks.lesson26;

class Solution {
    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "SEEE";

        System.out.println(exist(board, word));
    }
    static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {

        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (word.charAt(0) == board[i][j] && searchWord(i, j, 0, board, word))
                    return true;
            }
        }
        return false;
    }

    public static boolean searchWord(int i, int j, int index, char[][] board, String word) {

        if (index == word.length()) {

            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index)
                || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        if (searchWord(i, j + 1, index + 1, board, word) ||
                searchWord(i, j - 1, index + 1, board, word) ||
                searchWord(i + 1, j, index + 1, board, word) ||
                searchWord(i - 1, j, index + 1, board, word)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}
