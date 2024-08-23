package Tasks.lesson22;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityTaskManager {
    public static void main(String[] args) {
        Queue<String> priorityTasks = new PriorityQueue<>();


        priorityTasks.add("2 - Write unit tests");
        priorityTasks.add("1 - Review project proposal");
        priorityTasks.add("3 - Update documentation");
        priorityTasks.add("1 - Deploy to production");


        while (!priorityTasks.isEmpty()) {
            System.out.println("Processing " + priorityTasks.poll());
        }
    }
}
