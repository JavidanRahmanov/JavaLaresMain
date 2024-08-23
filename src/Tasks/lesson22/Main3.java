package Tasks.lesson22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        int numElements = 100000;


        long startTime, endTime;


        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add("Student " + i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add elements to ArrayList: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add("Student " + i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add elements to LinkedList: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to remove elements from ArrayList: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to remove elements from LinkedList: " + (endTime - startTime) + " ns");


        for (int i = 0; i < numElements; i++) {
            arrayList.add("Student " + i);
            linkedList.add("Student " + i);
        }


        startTime = System.nanoTime();
        arrayList.contains("Student 50000");
        endTime = System.nanoTime();
        System.out.println("Time taken to search element in ArrayList: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        linkedList.contains("Student 50000");
        endTime = System.nanoTime();
        System.out.println("Time taken to search element in LinkedList: " + (endTime - startTime) + " ns");
    }
}
