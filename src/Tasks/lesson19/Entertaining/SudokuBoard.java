package Tasks.lesson19.Entertaining;

import java.util.Random;

public class SudokuBoard {
    private int[][] board;
    private static final int SIZE = 9;
    private static final int SUBGRID_SIZE = 3;

    public SudokuBoard() {
        board = new int[SIZE][SIZE];
        generateBoard();
    }

    private void generateBoard() {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int num = rand.nextInt(SIZE) + 1;
                if (isValid(i, j, num)) {
                    board[i][j] = num;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public boolean isValid(int row, int col, int num) {

        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }


        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }


        int startRow = row - row % SUBGRID_SIZE;
        int startCol = col - col % SUBGRID_SIZE;
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isSolved() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setCell(int row, int col, int num) {
        board[row][col] = num;
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % SUBGRID_SIZE == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < SIZE; j++) {
                if (j % SUBGRID_SIZE == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
