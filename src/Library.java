import Book.java.Book;

public class Library {

    private Book[] books;

    private int bookCount;


    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }


    public void addBook(Book book) {

        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }


    public void printAvailableBooks() {
        System.out.println("Available books in the library:");

        for (int i = 0; i < bookCount; i++) {

            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }


    public Book findBookByTitle(String title) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }


    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null) {
            if (book.isAvailable()) {
                book.borrow();
                reader.increaseBorrowedCount();
                System.out.println("Success: Book '" + title + "' has been assigned to the reader.");
            } else {
                System.out.println("Fail: Book '" + title + "' is currently not available.");
            }
        } else {
            System.out.println("Fail: Book '" + title + "' not found in the library.");
        }
    }


    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null) {
            if (!book.isAvailable()) {
                book.returnBook();
                reader.decreaseBorrowedCount();
                System.out.println("Success: Book '" + title + "' has been returned to the library.");
            } else {
                System.out.println("Fail: Book '" + title + "' is already in the library.");
            }
        } else {
            System.out.println("Fail: Book '" + title + "' not found in the library.");
        }
    }
}