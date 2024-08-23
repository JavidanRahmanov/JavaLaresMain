package Tasks.lesson21.entertaining;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("orange");
        words.add("watermelon");


        Random random = new Random();
        String selectedWord = words.get(random.nextInt(words.size()));
        char[] guessedWord = new char[selectedWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int chancesLeft = 7;
        boolean wordGuessed = false;
        Scanner scanner = new Scanner(System.in);


        while (chancesLeft > 0 && !wordGuessed) {
            System.out.println("Current word: " + String.valueOf(guessedWord));
            System.out.println("Chances left: " + chancesLeft);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                chancesLeft--;
            }

            if (String.valueOf(guessedWord).equals(selectedWord)) {
                wordGuessed = true;
            }
        }


        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + selectedWord);
        } else {
            System.out.println("Sorry, you've run out of chances. The word was: " + selectedWord);
        }

        }
}

