package library;

public class Novel extends Book {
    public Novel(String bookName, String author, int bookID) {
        super(bookName, author, bookID, "Novel");
    }

    @Override
    public void showInfo() {
        System.out.println("Novel: " + bookName + " - " + author + " - Stock: " + stockStatus);
    }
}

