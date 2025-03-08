package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println(book.bookName + " added to library.");
    }

    public void listBooks() {
        System.out.println("\nAvailable books in the library:");
        for (Book book : bookList) {
            book.showInfo();
        }
    }
}

