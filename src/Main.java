import Book.java.Book;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);
        Book book2 = new Book("1984", "George Orwell", 328, true);
        Book book3 = new Book("Dune", "Frank Herbert", 412, false);


        System.out.println("--- Testing Task 1 ---");
        book1.printInfo();
        book3.printInfo();

        book1.borrow();
        book1.borrow();
        book1.returnBook();
    }
}