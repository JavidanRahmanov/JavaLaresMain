package Tasks.lesson16.normal.task1;

public class Rectangle extends Shape {

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    private int width;
private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }
}
