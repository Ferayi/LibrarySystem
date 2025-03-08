package library;

public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        book.borrow();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }
}

