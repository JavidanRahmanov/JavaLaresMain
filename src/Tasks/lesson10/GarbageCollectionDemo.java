package Tasks.lesson10;

import Tasks.lesson9.Author;

public class GarbageCollectionDemo {
    public static void runGarbageCollector() {
        System.gc();
    }

    public static void main(String[] args) {
        Author author1 = new Author("Cavidan", 2004);
        Author author2 = new Author("David", 2005);
        author2 = author1;
        runGarbageCollector();
        System.out.println(author1);
        System.out.println(author2);
    }
    
}
