import Book.java.Book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);
        Book book2 = new Book("1984", "George Orwell", 328, true);
        Book book3 = new Book("Dune", "Frank Herbert", 412, false);

        System.out.println(" Testing Task 1 ");
        book1.printInfo();
        book3.printInfo();

        book1.borrow();
        book1.borrow();
        book1.returnBook();


        System.out.println("\n Testing Task 2 ");

        Reader reader1 = new Reader("Jan", "Kowalski", "LIB-001");
        Reader reader2 = new Reader("Anna", "Nowak", "LIB-002");


        reader1.printData();
        reader2.printData();


        System.out.println("...changing borrowed counts...");
        reader1.increaseBorrowedCount();
        reader1.increaseBorrowedCount();

        reader2.increaseBorrowedCount();

        reader1.decreaseBorrowedCount();


        reader1.printData();
        reader2.printData();
    }
}