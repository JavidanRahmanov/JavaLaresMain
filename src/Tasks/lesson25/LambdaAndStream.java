package Tasks.lesson25;

import java.util.Arrays;
import java.util.List;

public class LambdaAndStream {

    public static void main(String[] args) {

        averageLength();
        productOfNums();

    }

    public static void averageLength(){

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        int averageLength = (int) words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("The average length of the strings is: " + averageLength);

    }

    public static void productOfNums(){


        List<Integer> nums = Arrays.asList(4, 76, 32, 1, 2, 45);

        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("The product of all numbers is: " + product);

    }
}
