package Tasks.lesson7;

import java.util.Random;
import java.util.Scanner;

public class RandomShipLocator {

    public static void ShipDeterminator(String[][] matrix) {
        Scanner sc = new Scanner(System.in);
        String response = "";

        while (!response.equals("no")) {
            System.out.println("Select the ships you want to place: ");
            System.out.println("1-Aircraft Carrier(5 cells)");
            System.out.println("2-Battleship(4 cells)");
            System.out.println("3-Submarine(3 cells)");
            System.out.println("4-Destroyer(3 cells)");
            System.out.println("5-Patrol Boat(2 cells)");
            int choose = sc.nextInt();
            sc.nextLine();
            int numberOfReplacements;

            switch (choose) {
                case 1:
                    numberOfReplacements = 5;
                    break;
                case 2:
                    numberOfReplacements = 4;
                    break;
                case 3:
                    numberOfReplacements = 3;
                    break;
                case 4:
                    numberOfReplacements = 3;
                    break;
                case 5:
                    numberOfReplacements = 2;
                    break;
                default:
                    System.out.println("Invalid selection, please choose again.");
                    continue;
            }
            placeShip(matrix, numberOfReplacements);
            System.out.println("Do you want to place another ship? (yes/no)");
            response = sc.nextLine().toLowerCase();
        }
    }

    public static void placeShip(String[][] matrix, int size) {
        Random random = new Random();
        boolean placed = false;

        while (!placed) {
            int startRow = random.nextInt(matrix.length);
            int startCol = random.nextInt(matrix[0].length);
            boolean horizontal = random.nextBoolean();

            if (canPlaceShip(matrix, startRow, startCol, size, horizontal)) {
                for (int i = 0; i < size; i++) {
                    if (horizontal) {
                        matrix[startRow][startCol + i] = "S";
                    } else {
                        matrix[startRow + i][startCol] = "S";
                    }
                }
                placed = true;
            }
        }
    }

    private static boolean canPlaceShip(String[][] matrix, int startRow, int startCol, int size, boolean horizontal) {
        if (horizontal) {
            if (startCol + size > matrix[0].length) return false;
            for (int i = -1; i <= size; i++) {
                for (int j = -1; j <= 1; j++) {
                    int row = startRow + j;
                    int col = startCol + i;
                    if (isWithinBounds(matrix, row, col) && !matrix[row][col].equals("~")) return false;
                }
            }
        } else {
            if (startRow + size > matrix.length) return false;
            for (int i = -1; i <= size; i++) {
                for (int j = -1; j <= 1; j++) {
                    int row = startRow + i;
                    int col = startCol + j;
                    if (isWithinBounds(matrix, row, col) && !matrix[row][col].equals("~")) return false;
                }
            }
        }
        return true;
    }

    private static boolean isWithinBounds(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }
}