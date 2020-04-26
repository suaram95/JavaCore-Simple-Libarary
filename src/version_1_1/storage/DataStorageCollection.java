package version_1_1.storage;

import version_1_1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class DataStorageCollection {

    private List<Book> books;

    public DataStorageCollection(int length) {
        books = new ArrayList<>(length);
    }

    public DataStorageCollection() {
        books = new ArrayList<>(16);
    }

    public void add(Book value) {
        books.add(value);
    }

    public void printBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book getBookByIndex(int index) {
        return books.get(index);
    }

    public int getBookSize() {
        return books.size();
    }


    public boolean isBookListEmty() {
        return books.isEmpty();
    }

    public Book getBookByTitle(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                System.out.println(book);
            }
        }
        return null;
    }
}
