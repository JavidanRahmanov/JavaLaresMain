package Tasks.lesson17.normal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isContinue = "yes";
        while (isContinue.equalsIgnoreCase("yes")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter email: ");
            sc.nextLine();
            String email = sc.nextLine();
            Participant participant = new Participant(name, age, email);

            try {
             FileWriter fileWriter = new FileWriter("participants.txt",true);
                fileWriter.write(participant.getName()+","+participant.getEmail()+","+participant.getAge()+"\n");
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Something went wrong! ");
            }

            System.out.println("Do you want to continue?");
            isContinue = sc.nextLine().toLowerCase();
        }
        Participant empty = new Participant();
        empty.displayParticipants();

    }
}