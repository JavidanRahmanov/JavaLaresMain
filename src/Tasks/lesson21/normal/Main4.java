package Tasks.lesson21.normal;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageString = scanner.nextLine();

        int age = Integer.parseInt(ageString);

        int yearsUntil18 = 18 - age;

        if (yearsUntil18 > 0)
            System.out.println("You will turn 18 in " + yearsUntil18 + " years.");
        else if (yearsUntil18 == 0)
            System.out.println("You are 18 years old this year!");
        else
            System.out.println("You turned 18 " + Math.abs(yearsUntil18) + " years ago.");
    }

}
