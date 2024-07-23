package Tasks.lesson14.entertaining;



import java.util.Scanner;

public class ShapeChallenge {

        private static final int rectanglePoints = 5;
        private static final int circlePoints = 10;
        private static final int trianglePoints = 15;
        private static int score = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ShapeCalculator shapeCalculator = new ShapeCalculator();

            System.out.println("Welcome to the Shape Challenge Game!");

            boolean continueGame = true;

            while (continueGame) {
                System.out.println("\nChoose a shape (rectangle, circle, triangle) or type 'quit' to exit:");
                String shape = scanner.next().toLowerCase();

                switch (shape) {
                    case "rectangle":
                        System.out.println("Enter the length:");
                        double length = scanner.nextDouble();
                        System.out.println("Enter the width:");
                        double width = scanner.nextDouble();
                        double rectangleArea = shapeCalculator.calculateArea(length, width);
                        System.out.println("The area of the rectangle is: " + rectangleArea);
                        score += rectanglePoints;
                        break;

                    case "circle":
                        System.out.println("Enter the radius:");
                        double radius = scanner.nextDouble();
                        double circleArea = shapeCalculator.calculateArea(radius);
                        System.out.println("The area of the circle is: " + circleArea);
                        score += circlePoints;
                        break;

                    case "triangle":
                        System.out.println("Enter the base:");
                        double base = scanner.nextDouble();
                        System.out.println("Enter the height:");
                        double height = scanner.nextDouble();
                        double triangleArea = shapeCalculator.calculateArea(base, height, true);
                        System.out.println("The area of the triangle is: " + triangleArea);
                        score += trianglePoints;
                        break;

                    case "quit":
                        continueGame = false;
                        break;

                    default:
                        System.out.println("Invalid shape. Please choose again.");
                        continue;
                }

                System.out.println("Your current score is: " + score);
            }

            System.out.println("\nGame Over! Your total score is: " + score);
            scanner.close();
        }
    }



