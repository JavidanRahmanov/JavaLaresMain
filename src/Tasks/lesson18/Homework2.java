package Tasks.lesson18;

public class Homework2 {

    private final Object lock = new Object();
    private final String[] firstArray = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
    private final String[] secondArray = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
    private boolean firstArrayTurn = true;

    public void printFirstArray() {
        synchronized (lock) {
            for (String e : firstArray) {
                while (!firstArrayTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                System.out.println(e);
                firstArrayTurn = false;
                lock.notify();
            }
        }
    }

    public void printSecondArray() {
        synchronized (lock) {
            for (String e : secondArray) {
                while (firstArrayTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                System.out.println(e);
                firstArrayTurn = true;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        Homework2 homework2 = new Homework2();
        Thread firstThread = new Thread(homework2::printFirstArray);
        Thread secondThread = new Thread(homework2::printSecondArray);

        firstThread.start();
        secondThread.start();
    }
}
