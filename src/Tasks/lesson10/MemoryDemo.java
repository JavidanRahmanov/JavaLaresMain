package Tasks.lesson10;

import Tasks.lesson9.Author;

public class MemoryDemo {
    public static void main(String[] args) {
        stackVsHeap();
    }
    public static void stackVsHeap(){
        int a = 10;
        char b = 'c';
        Author author1 =  new Author("Cavidan",2004);
        Author author2 = new Author("David",2005);
        author2 = author1;
    }

}
