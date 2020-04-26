package version_1_1;

import version_1_1.model.Book;
import version_1_1.storage.DataStorageCollection;

import java.util.Scanner;

public class BookTest implements Commands {

    private static Scanner scanner = new Scanner(System.in);
//    private static DataStorage<Book> dataStorage = new DataStorage<>();
    private static DataStorageCollection dataStorage=new DataStorageCollection();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            showCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    System.out.println("Program closed");
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    searchBook();
                    break;
                default:
                    System.err.println("You entered Wrong Command!!");
            }

        }

    }

    private static void showCommands() {
        System.out.println("Input " + EXIT + " to EXIT");
        System.out.println("Input " + ADD_BOOK + " to ADD BOOK to storage");
        System.out.println("Input " + SEARCH_BOOK_BY_TITLE + " to SEARCH BOOK BY TITLE");
    }

    private static void addBook() {
        System.out.println("Input data about Book");
        System.out.println("Book Tilte: ");
        String title = scanner.nextLine();
        System.out.println("Author Name: ");
        String authorName = scanner.nextLine();
        System.out.println("Set Book price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input count of Book: ");
        int count = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title, authorName, price, count);
        dataStorage.add(book);
        dataStorage.printBook();
    }

    private static void searchBook() {
        if (dataStorage.isBookListEmty()){
            System.out.println("First add book!");
            addBook();
        }
        dataStorage.printBook();
        System.out.println("Input Books title to search");
        String searchedTitle = scanner.nextLine();
        dataStorage.getBookByTitle(searchedTitle);

    }
}
