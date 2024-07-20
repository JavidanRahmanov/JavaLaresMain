package Tasks.lesson12;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question1 = new Question("What is the default value of a boolean variable in Java?",new String[]{"A. true", "B. false", "C. 0", "D. null"}, "easy","B");
        Question question2 = new Question("Which loop is guaranteed to execute at least once?",new String[] {"A. for loop","B. while loop","C. do-while loop","D. None of the above"},"medium","C");
        Question question3 = new Question("Which of the following is not a pillar of Object-Oriented Programming in Java?", new String[] {"A. Encapsulation","B. Inheritance","C. Polymorphism","D. Compilation"},"hard","D");
        List<Question> questions = new ArrayList<>();

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        int count = 0;

        System.out.println("-------------WELCOME TO THE QUIZ GAME---------------");
        for(Question obj: questions) {
            System.out.println(obj);
            System.out.println("Do you want to skip the question?");
            String skip = sc.nextLine().toLowerCase();
            if(skip.equals("yes"))
                continue;
            System.out.println("Please enter the correct answer: ");
            String answer = sc.nextLine().toUpperCase();
            if(obj.getCorrectAnswer().equals(answer)) {
                System.out.println("Your answer is correct!");
                count++;
                Question.score+= obj.questionPoint();
            }
            else
                System.out.println("Your answer is wrong!");
        }
        System.out.println("You answered " + count + " out of " + questions.size() + " questions. Your score is " + Question.score + ".");
    }
}

