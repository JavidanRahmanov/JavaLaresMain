package Tasks.lesson19.Homework;

public class StringUsage {


    public static void main(String[] args) {

        String a = "Hello World!";
        String b = "Today we will learn about 'String'.";

        a = a.concat(b);
        System.out.println(a);

        int c = a.length();
        System.out.println(c);

        a = a.substring(6,17);
        System.out.println(a);


    }

}
