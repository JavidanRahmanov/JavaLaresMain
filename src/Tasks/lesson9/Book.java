package Tasks.lesson9;

public class Book {
    String title;
    Author author;
    int publicationYear;


    public Book(String title, Author author, int publicationYear){
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
}
    @Override
    public String toString() {
        return "Book: " + title +   author + ", Publication Year: " + publicationYear + ")";
    }
}
