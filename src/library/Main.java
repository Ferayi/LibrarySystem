package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Novel novel = new Novel("Martin Eden", "Jack London", 1);
        Poetry poetry = new Poetry("Seçme Şiirler", "Özdemir Asaf", 2);

        library.addBook(novel);
        library.addBook(poetry);

        library.listBooks();

        Member member = new Member("Belinay");
        member.borrowBook(novel);
        library.listBooks();

        member.returnBook(novel);
        library.listBooks();
    }
}

