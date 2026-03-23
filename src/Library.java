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
}