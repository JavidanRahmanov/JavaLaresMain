package Tasks.lesson25;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        lessThan5();
        skipFirst2();
    }

    public static void lessThan5(){

        List<Integer> nums = Arrays.asList(4, 76, 32, 1, 2, 45);

        List<Integer> newNums =nums.stream().filter(n->n<5).toList();

        for (Integer newNum : newNums) {
            System.out.println(newNum);
        }
    }

    public static void skipFirst2(){

        List<Integer> nums = Arrays.asList(4, 76, 32, 1, 2, 45);

       List<Integer> newNums = nums.stream().skip(2).toList();

        for (Integer newNum : newNums) {

            System.out.println(newNum);
        }
    }
}
