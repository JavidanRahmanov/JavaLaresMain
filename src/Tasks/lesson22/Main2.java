package Tasks.lesson22;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(12);

        double sum=0;
        int min = numbers.get(0);
        int max = numbers.getFirst();
        for(Integer number: numbers){
            if(min>number)
                min = number;
            if(max<number)
                max = number;
            sum+=number;
        }
        System.out.println("Sum: "+ sum);

        System.out.println("Average: "+ sum/numbers.size());

        System.out.println("Min: "+ min);

        System.out.println("Max: "+ max);
    }
}
