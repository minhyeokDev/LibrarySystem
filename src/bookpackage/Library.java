package bookpackage;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private  List<Book> books;
    public Library(List<book> books) {
        this.books = books;

    }
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1 , true));
        books.add(new Book(2 , true));
        books.add(new Book(3 , true));

    }
}
