package Tasks.lesson19.Entertaining;

import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;

    public SudokuGame() {
        board = new SudokuBoard();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!board.isSolved()) {
            board.printBoard();
            System.out.println("Oyundan çıxmaq üçün 'exit' yazın (davam etmək üçün 'Enter' düyməsinə basın).");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Oyun dayandırıldı. Çıxış edilir...");
                break;
            }

            try {
                System.out.print("Sətir, sütun və rəqəmi daxil edin (0-8): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                int num = scanner.nextInt();
                scanner.nextLine();

                if (!board.isValid(row, col, num)) {
                    throw new InvalidMoveException("Bu hərəkət mümkün deyil!");
                }
                board.setCell(row, col, num);
            } catch (InvalidMoveException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Yanlış daxil etmə! Lütfən, 0-8 aralığında rəqəmlər daxil edin.");
                scanner.nextLine();
            }
        }

        if (board.isSolved()) {
            System.out.println("Təbriklər! Board-u doldurdunuz.");
        }

    }

    public static void main(String[] args) {
        SudokuGame game = new SudokuGame();
        game.play();
    }
}
