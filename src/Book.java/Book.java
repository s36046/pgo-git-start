package Book.java;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }


    public void printInfo() {
        System.out.println("Book: '" + title + "' by " + author + ", Pages: " + pageCount + ", Available: " + available);
    }


    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }


    public void returnBook() {
        available = true;
        System.out.println("You returned: " + title);
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}