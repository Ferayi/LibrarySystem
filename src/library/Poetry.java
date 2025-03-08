package library;

public class Poetry extends Book {
    public Poetry(String bookName, String author, int bookID) {
        super(bookName, author, bookID, "Poetry");
    }

    @Override
    public void showInfo() {
        System.out.println("Poetry: " + bookName + " - " + author + " - Stock: " + stockStatus);
    }
}

