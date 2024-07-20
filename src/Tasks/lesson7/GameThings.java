package Tasks.lesson7;

import java.util.Scanner;

public class GameThings {
    static String map1[][] = new String[10][10];
    static String map2[][] = new String[15][20];
    static String map3[][] = new String[20][20];
    public static String[][] choosingMap(){
        Scanner sc = new Scanner(System.in);

        String[][] newMap;
        System.out.println("Choose one of the maps: ");
        System.out.println("1-Green Hills");
        System.out.println("2-Perilous Cliffs");
        System.out.println("3-North Mountains");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                newMap = map1;
                break;
            case 2:
                newMap = map2;
                break;
            case 3:
                newMap = map3;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Green Hills.");
                newMap = map1;
                break;
        }
       return newMap;
    }
    public static String[][] fullingNewMap(String[][] newMap){
        for (int i = 0; i < newMap.length; i++) {
            for (int j = 0; j < newMap[i].length; j++) {
                newMap[i][j] = "~";
            }
        }
        return newMap;
    }
    public static void welcome(){
        System.out.println("----------------------Welcome to Battleship War!-----------------------");
    }
}
