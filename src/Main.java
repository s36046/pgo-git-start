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


        System.out.println("\n Testing Task 3 ");

        // Создаем библиотеку, в которую влезет максимум 5 книг
        Library myLibrary = new Library(5);

        // Добавляем наши книги из Task 1 в библиотеку
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        // Выводим только доступные книги
        myLibrary.printAvailableBooks();

        // Считаем их
        int availableCount = myLibrary.countAvailableBooks();
        System.out.println("Total available books: " + availableCount);

        // Пробуем найти книгу
        System.out.println("Searching for '1984'...");
        Book foundBook = myLibrary.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Book found!");
            foundBook.printInfo();
        } else {
            System.out.println("Book not found.");
        }


        System.out.println("\n Testing Task 4 ");


        myLibrary.printAvailableBooks();


        System.out.println("\n>>> Action: Reader 1 is trying to borrow '1984'...");
        myLibrary.borrowBook("1984", reader1);


        System.out.println("\n--- State after borrowing ---");
        myLibrary.printAvailableBooks();
        reader1.printData();


        System.out.println("\n>>> Action: Reader 1 is returning '1984'...");
        myLibrary.returnBook("1984", reader1);


        System.out.println("\n--- Final state ---");
        myLibrary.printAvailableBooks();
        reader1.printData();


}
}