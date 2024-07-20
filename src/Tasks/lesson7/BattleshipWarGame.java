package Tasks.lesson7;

import java.util.Scanner;

public class BattleshipWarGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameThings.welcome();
        String[][] map = GameThings.choosingMap();
        String[][] newMap = GameThings.fullingNewMap(map);
        String[][] spNewMap = new String[map.length][map[0].length];


        for (int i = 0; i < spNewMap.length; i++) {
            for (int j = 0; j < spNewMap[i].length; j++) {
                spNewMap[i][j] = "~";
            }
        }

        RandomShipLocator.ShipDeterminator(newMap);

//        for (int i = 0; i < newMap.length; i++) {
//            for (int j = 0; j < newMap[i].length; j++) {
//                System.out.print(newMap[i][j] + " ");
//            }
//            System.out.println();
//        }

        int shipCount = 0;
        for (int i = 0; i < newMap.length; i++) {
            for (int j = 0; j < newMap[i].length; j++) {
                if (newMap[i][j].equals("S"))
                    shipCount++;
            }
        }

        int hitCount = 0;
        while (shipCount != hitCount) {
            System.out.println("Select coordination that you want to hit: ");
            for (int k = 0; k < spNewMap.length; k++) {
                for (int l = 0; l < spNewMap[k].length; l++) {
                    System.out.print(spNewMap[k][l] + " ");
                }
                System.out.println();
            }
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println("Hitted coordination: {" + x + ", " + y + "}");
            if (newMap[x][y].equals("S")) {
                System.out.println("You hit the ship!");
                spNewMap[x][y] = "X";
                hitCount++;
            } else {
                System.out.println("You can't hit the ship!");
                spNewMap[x][y] = "O";
            }

            for (int k = 0; k < spNewMap.length; k++) {
                for (int l = 0; l < spNewMap[k].length; l++) {
                    System.out.print(spNewMap[k][l] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("You hit all ships! You won!");
    }
}

