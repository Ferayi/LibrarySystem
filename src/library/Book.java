package library;

public abstract class Book {
    protected String bookName;
    protected String author;
    protected int bookID;
    protected String type;
    protected StockStatus stockStatus;

    public Book(String bookName, String author, int bookID, String type) {
        this.bookName = bookName;
        this.author = author;
        this.bookID = bookID;
        this.type = type;
        this.stockStatus = StockStatus.IN_STOCK;
    }

    public StockStatus getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(StockStatus stockStatus) {
        this.stockStatus = stockStatus;
    }

    public void borrow() {
        if (stockStatus == StockStatus.IN_STOCK) {
            stockStatus = StockStatus.BORROWED;
            System.out.println(bookName + " borrowed.");
        } else {
            System.out.println(bookName + " is not available for borrowing.");
        }
    }

    public void returnBook() {
        if (stockStatus == StockStatus.BORROWED) {
            stockStatus = StockStatus.IN_STOCK;
            System.out.println(bookName + " returned.");
        } else {
            System.out.println(bookName + " is already in stock.");
        }
    }

    public abstract void showInfo();
}

