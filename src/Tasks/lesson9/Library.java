package Tasks.lesson9;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", 1965);
        System.out.println(author1);
        Book book1 = new Book("Harry Potter and the Philosopher's Stone",author1, 1997);
        System.out.println(book1);
        Author author2 = new Author("George Orwell", 1903);
        System.out.println(author2);
        Book book2 = new Book("1984",author2, 1949);
        System.out.println(book2);
        Book book3 = new Book("To Kill a Mockingbird",author1, 1960);
        System.out.println(book3);
    }
}
