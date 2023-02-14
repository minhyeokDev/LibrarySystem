package bookpackage;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    int getNumber(int n){

        return books.indexOf(getName(n));
    }
    String getName(int number){
        return books.get(number).BookName();
    }

    String getStatus(int number){
        return books.get(number).status();
    }

    boolean getBorrow(int number){
        int set = number - 1;
        return books.get(set).BookBorrow();
    }

}
