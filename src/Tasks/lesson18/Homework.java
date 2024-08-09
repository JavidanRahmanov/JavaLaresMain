package Tasks.lesson18;

public class Homework {

    private final int maxNumber = 10000;
    private int count = 1;
    private final Object lock = new Object();

    public void printOdd() {

        synchronized (lock) {
            while (count < maxNumber) {
                while (count % 2 == 0) {

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(count);
                count++;
                lock.notify();

            }
        }
        }
    public void printEven() {
        synchronized (lock)
        {
            while (count < maxNumber) {
                while (count % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(count);
                count++;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        Homework oddEvenPrinter = new Homework();
        Thread oddThread = new Thread(oddEvenPrinter::printOdd);
        Thread evenThread = new Thread(oddEvenPrinter::printEven);

        oddThread.start();
        evenThread.start();
    }
    }
