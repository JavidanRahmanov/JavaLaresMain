package Tasks.lesson19.Homework;

import java.time.Year;

public class StringBuilderUsage {

    public static void main(String[] args) {

        StringBuilder strb = new StringBuilder("\nI know that I am intelligent, because I know that I know nothing.");
        strb.append("\n                                                   ~Cavidan Rahmanov");
        int year = Year.now().getValue();
        strb.insert(0,year);
        System.out.println(strb);
    }
}
