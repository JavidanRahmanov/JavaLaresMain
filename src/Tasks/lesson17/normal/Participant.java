package Tasks.lesson17.normal;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.String;

public class Participant {

    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Participant() {

    }

    public static void main(String[] args) {

    }
    void displayParticipants(){
        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader("participants.txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("File cannot closed.");
            }
        }

    }
}
