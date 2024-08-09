package Tasks.lesson16.normal.task2;

public class ResizableRectangle implements Resizable {
    private double width;
    private double length;

    public ResizableRectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void resize(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }

    public static void main(String[] args) {
        ResizableRectangle newRectangle = new ResizableRectangle(5.4,5.8);
        newRectangle.resize(10.5,20.8);
    }
}
