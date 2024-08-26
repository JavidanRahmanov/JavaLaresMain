package Tasks.lesson23.entertaining;

import java.util.Random;
import java.util.Scanner;

public class Game2048 {

    private static final int SIZE = 4;
    private static final int WIN_TILE = 2048;
    private int[][] board = new int[SIZE][SIZE];
    private int score = 0;
    private Random random = new Random();

    public static void main(String[] args) {
        Game2048 game = new Game2048();
        game.play();
    }

    public void play() {
        spawnTile();
        spawnTile();
        while (true) {
            printBoard();
            if (isGameOver()) {
                System.out.println("Game Over! Your final score is " + score);
                break;
            }
            System.out.println("Score: " + score);
            System.out.println("Enter move (W = up, A = left, S = down, D = right): ");
            char move = new Scanner(System.in).next().toUpperCase().charAt(0);
            switch (move) {
                case 'W': moveUp(); break;
                case 'A': moveLeft(); break;
                case 'S': moveDown(); break;
                case 'D': moveRight(); break;
                default: System.out.println("Invalid move. Please try again.");
            }
            spawnTile();
            if (hasWon()) {
                printBoard();
                System.out.println("Congratulations! You've reached the 2048 tile! Final score: " + score);
                break;
            }
        }
    }

    private void spawnTile() {
        int value = random.nextInt(10) == 0 ? 4 : 2;
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (board[x][y] != 0);
        board[x][y] = value;
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println();
        }
        System.out.println();
    }

    private void moveUp() {
        for (int col = 0; col < SIZE; col++) {
            int[] newCol = new int[SIZE];
            int index = 0;
            for (int row = 0; row < SIZE; row++) {
                if (board[row][col] != 0) {
                    if (index > 0 && newCol[index - 1] == board[row][col]) {
                        newCol[index - 1] *= 2;
                        score += newCol[index - 1];
                    } else {
                        newCol[index++] = board[row][col];
                    }
                }
            }
            for (int row = 0; row < SIZE; row++) {
                board[row][col] = newCol[row];
            }
        }
    }

    private void moveDown() {
        for (int col = 0; col < SIZE; col++) {
            int[] newCol = new int[SIZE];
            int index = SIZE - 1;
            for (int row = SIZE - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    if (index < SIZE - 1 && newCol[index + 1] == board[row][col]) {
                        newCol[index + 1] *= 2;
                        score += newCol[index + 1];
                    } else {
                        newCol[index--] = board[row][col];
                    }
                }
            }
            for (int row = 0; row < SIZE; row++) {
                board[row][col] = newCol[row];
            }
        }
    }

    private void moveLeft() {
        for (int row = 0; row < SIZE; row++) {
            int[] newRow = new int[SIZE];
            int index = 0;
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] != 0) {
                    if (index > 0 && newRow[index - 1] == board[row][col]) {
                        newRow[index - 1] *= 2;
                        score += newRow[index - 1];
                    } else {
                        newRow[index++] = board[row][col];
                    }
                }
            }
            board[row] = newRow;
        }
    }

    private void moveRight() {
        for (int row = 0; row < SIZE; row++) {
            int[] newRow = new int[SIZE];
            int index = SIZE - 1;
            for (int col = SIZE - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    if (index < SIZE - 1 && newRow[index + 1] == board[row][col]) {
                        newRow[index + 1] *= 2;
                        score += newRow[index + 1];
                    } else {
                        newRow[index--] = board[row][col];
                    }
                }
            }
            board[row] = newRow;
        }
    }

    private boolean isGameOver() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) return false;
                if (col < SIZE - 1 && board[row][col] == board[row][col + 1]) return false;
                if (row < SIZE - 1 && board[row][col] == board[row + 1][col]) return false;
            }
        }
        return true;
    }

    private boolean hasWon() {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == WIN_TILE) return true;
            }
        }
        return false;
    }
}

