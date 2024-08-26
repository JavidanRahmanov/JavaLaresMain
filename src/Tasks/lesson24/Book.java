package Tasks.lesson24;

import java.util.*;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int publishYear;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public Book() {

        books = new ArrayList<>();

        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851));
        books.add(new Book("Title", "Cavidan", 1958));
        books.add(new Book("Title", "Perviz", 1948));
        books.add(new Book("Title", "Cavid", 1968));
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.publishYear, other.publishYear);
    }


    void showBookList() {

        for (Book book : books) {

            System.out.println(book);

        }
    }

    public static void main(String[] args) {

        Book main = new Book();

        System.out.println("Before sorting: ");
        main.showBookList();

        System.out.println("\n\nAfter sorting(by publish year): ");
        Collections.sort(main.getBooks());
        main.showBookList();

        System.out.println("\n\nAfter sorting(by title): ");
        Collections.sort(main.getBooks(), new BookTitleComparator());
        main.showBookList();

        System.out.println("\n\nAfter sorting(by author name): ");
        Collections.sort(main.getBooks(), new BookAuthorComparator());
        main.showBookList();

        System.out.println("\n\nAfter sorting(by author name and title): ");
        Collections.sort(main.getBooks(), new BookTitleAuthorComparator());
        main.showBookList();

    }
}
