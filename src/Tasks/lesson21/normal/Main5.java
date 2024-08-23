package Tasks.lesson21.normal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b[Ss]\\w*");
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Words starting with 'S':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
