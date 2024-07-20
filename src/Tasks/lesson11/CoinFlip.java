package Tasks.lesson11;

import java.util.*;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ichoice;
        int count = 0;
        String choice;
        String playAgain = " ";

        do {
            System.out.println("Select your choice (Heads or Tails(h/t)): ");
            choice = sc.nextLine().toLowerCase();

            Random rnd = new Random();
            int randomNumber = rnd.nextInt(2);

            switch (choice) {
                case "heads":
                case "h":
                    ichoice = 0;
                    if (ichoice == randomNumber) {
                        System.out.println("You win! It was Heads.");
                        count++;
                    } else {
                        System.out.println("You lost! It was Tails.");
                    }
                    break;
                case "tails":
                case "t":
                    ichoice = 1;
                    if (ichoice == randomNumber) {
                        System.out.println("You win! It was Tails.");
                        count++;
                    } else {
                        System.out.println("You lost! It was Heads.");
                    }
                    break;
                default:
                    System.out.println("Invalid option! Try again...");
                    continue;
            }

            System.out.println("Do you want to play again? (yes or no (y/n))");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("Thanks for playing! You won " + count + " times.");
        sc.close();
    }
}
