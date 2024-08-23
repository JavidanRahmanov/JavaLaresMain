package Tasks.lesson19.Homework;

public class StringBufferUsage {

    StringBuffer stringBuffer = new StringBuffer("Hello World");


    public static void main(String[] args) {
        StringBufferUsage stringBufferUsage = new StringBufferUsage();

        Thread thread1 = new Thread(stringBufferUsage::firstThread);
        Thread thread2 = new Thread(stringBufferUsage::secondThread);
        Thread thread3 = new Thread(stringBufferUsage::thirdThread);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringBufferUsage.stringBuffer);
    }
    void firstThread(){
    stringBuffer.append(" ,I am Javidan");

    }

    void secondThread(){

        stringBuffer.append(" ,I am 20");
    }

    void thirdThread(){

        stringBuffer.append(" ,I am backend developer");
    }

}
