package version_1_0;

import java.util.Scanner;

public class BookTest {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input count of books");
        int booksCount=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < booksCount; i++) {

            System.out.println("Input Title of Book");
            String title = scanner.nextLine();
            System.out.println("Input Author name");
            String authorName = scanner.nextLine();
            System.out.println("Set the price of Book");
            double price=Double.parseDouble(scanner.nextLine());
            System.out.println("Set the count of Book");
            int count=Integer.parseInt(scanner.nextLine());

            Book book=new Book();
            book.setTitle(title);
            book.setAuthorName(authorName);
            book.setPrice(price);
            book.setCount(count);
            System.out.println(book);
        }

    }
}
