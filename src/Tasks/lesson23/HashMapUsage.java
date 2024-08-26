package Tasks.lesson23;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {

    public static void main(String[] args) {

        HashMap<String, Integer> student = new HashMap<>();

        student.put("Jack",10);
        student.put("Carl", 10);
        student.put("Daniel",11);
        student.put("Jane",9);
        student.put("Rose",8);


        System.out.println(student.get("Jane"));

        System.out.println("Before removal: ");
        for(Map.Entry<String,Integer> entry: student.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        student.remove("Daniel");

        System.out.println("After removal: ");
        for(Map.Entry<String,Integer> entry: student.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

}
