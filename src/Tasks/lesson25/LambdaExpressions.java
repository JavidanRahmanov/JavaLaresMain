package Tasks.lesson25;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class LambdaExpressions {

    public static void main(String[] args) {

        isPositive();
        roundIntegers();
    }

    public static void isPositive(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        boolean isPositive = Optional.of(num).stream().anyMatch(n->n>0);
        if(isPositive)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");

    }

    public static void roundIntegers(){

        double[] nums = {2.4, 5.6, 2.6, 1.2, 12.89, 3};


        int[] roundNums = Arrays.stream(nums).
                mapToInt(n->(int) Math.round(n)).toArray();

        for (int roundNum : roundNums) {
            System.out.println(roundNum);
        }
    }
}
