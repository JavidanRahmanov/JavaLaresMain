package Tasks.lesson16.normal.task1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        Rectangle square = new Rectangle(5, 4);
        System.out.println(square.calculateArea());
    }
}
