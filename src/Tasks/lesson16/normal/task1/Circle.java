package Tasks.lesson16.normal.task1;

public class Circle extends Shape {

private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
