package Tasks.lesson22;

import java.util.LinkedList;
import java.util.Queue;

public class TaskManager {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();


        tasks.add("Task 1: Review project proposal");
        tasks.add("Task 2: Write unit tests");
        tasks.add("Task 3: Update documentation");
        tasks.add("Task 4: Deploy to production");


        while (!tasks.isEmpty()) {
            System.out.println("Processing " + tasks.poll());
        }
    }
}


