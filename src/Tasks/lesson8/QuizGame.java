package Tasks.lesson8;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
    startQuiz();
    askQuestion();
    }
    static void startQuiz(){
        System.out.println("---------------Welcome to the Science Quiz!---------------");
    }
   static void askQuestion(){
        int score = 0;
         Scanner input = new Scanner(System.in);
        System.out.println("Question 1: What is the chemical symbol for water?");
        System.out.println("Options: A) H2O, B) CO2, C) O2");
        String answer1 = input.nextLine().toUpperCase();
        int question1 = 1;
        if(!evaluateAnswer(answer1,question1))
           score++;
        System.out.println("Question 2: How many planets are in our solar system?");
        System.out.println("Options: A) 7, B) 8, C) 9");
        String answer2 = input.nextLine().toUpperCase();
        int question2 = 2;
        if(!evaluateAnswer(answer2,question2))
            score++;
        String answer3 = input.nextLine().toUpperCase();
        int question3 = 3;

        show("Question 3: What is the capital of France?","Options: A) Berlin, B) Madrid, C) Paris",answer3, 3  );

        if(!evaluateAnswer(answer3,question3))
           score++;
        endQuiz(score);
    }

    public static void show(String text, String variants, String ans, int q){
        System.out.println(text);
        System.out.println(variants);
        String answer3 = ans;
        int question3 = q;
    }


    static boolean evaluateAnswer(String answer,int question){
         switch(question){
             case 1: if(answer.equals("A"))
                 return false;
             break;
             case 2: if(answer.equals("B"))
                 return false;
             break;
             case 3: if(answer.equals("C"))
                 return false;
             break;
         }
        return true;
    }
   static void endQuiz(int score)
    {
        System.out.println("Final Score: " + score);
    }
}
