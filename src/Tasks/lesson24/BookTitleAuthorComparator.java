package Tasks.lesson24;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {


        if (book1.getTitle().compareTo(book2.getTitle()) == 0) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }

        return book1.getTitle().compareTo(book2.getTitle());
    }
}


