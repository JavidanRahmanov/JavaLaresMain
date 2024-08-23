package Tasks.lesson22;

class Pair<T, U> {

    private T value1;
    private U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public void swapPair() {
        T temp = value1;
        value1 = (T) value2;
        value2 = (U) temp;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Cavidan");
        System.out.println("First form of pair: "+ pair);
        pair.swapPair();
        System.out.println("First form of pair: " + pair);
    }
}
