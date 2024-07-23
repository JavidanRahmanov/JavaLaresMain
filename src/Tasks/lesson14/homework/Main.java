package Tasks.lesson14.homework;

public class Main {

    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
//        mathOperations.add(4.5,3.2);
//        mathOperations.add(4,5,5.6);
//        mathOperations.subtract(8.9,4.3);
//        mathOperations.subtract(4.3,3.6,2);
//        mathOperations.multiply(4.3,5);
//        mathOperations.multiply(4.3,3.6,2);
//        mathOperations.divide(4.5,3.2);
//        mathOperations.divide(4.3,3.6,2);

        System.out.println(mathOperations.mathOperation(5));
        System.out.println(mathOperations.mathOperation(5.4,2.3));
        System.out.println(mathOperations.mathOperation(5,6,7.8));
        System.out.println(mathOperations.mathOperation(4,2,3.6,4.6));

    }

}
