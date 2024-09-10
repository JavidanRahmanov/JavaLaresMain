package Tasks.lesson21.entertaining;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\User\\IdeaProjects\\JavaLaresMain\\src\\Tasks\\lesson21\\entertaining\\data.txt";
        Scanner sc = new Scanner(System.in);

        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));

            if (!lines.isEmpty()) {
                Random rnd = new Random();
                int rndIndex = rnd.nextInt(lines.size());

                String rndLine = lines.get(rndIndex).trim();
                String[] splitLine = rndLine.split(":");

                System.out.println("Word's category: " + splitLine[0].trim());

                String[] words = splitLine[1].split(",");
                int rdnWordsIndex = rnd.nextInt(words.length);
                String rndWord = words[rdnWordsIndex].trim();

                StringBuilder guessWord = new StringBuilder();
                for (int i = 0; i < rndWord.length(); i++) {
                    char c = rndWord.charAt(i);
                    if (c == ' ') {
                        guessWord.append(' ');
                    } else {
                        guessWord.append('_');
                    }
                }

                System.out.println("Guess the word: " + guessWord);
                int attempts = 7;
                boolean isGuessed = false;

                while (attempts > 0) {
                    boolean isCorrectLetter = false;

                    System.out.println("Guess a letter: ");
                    char guessLetter = sc.next().charAt(0);


                    for (int i = 0; i < rndWord.length(); i++) {
                        if (guessLetter == rndWord.charAt(i)) {
                            guessWord.setCharAt(i, guessLetter);
                            isCorrectLetter = true;
                        }
                    }


                    if (guessWord.toString().equals(rndWord)) {
                        isGuessed = true;
                        break;
                    }

                    if (isCorrectLetter) {
                        System.out.println("You guessed the letter: " + guessLetter + " correctly");
                    } else {
                        System.out.println("The word doesn't contain the letter: " + guessLetter);
                        attempts--;
                    }

                    System.out.println("Guessed form: " + guessWord);
                }

                if (isGuessed) {
                    System.out.println("You guessed the word: " + rndWord);
                } else {
                    System.out.println("You couldn't guess the word: " + rndWord);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
