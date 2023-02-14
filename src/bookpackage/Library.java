package bookpackage;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    int getNumber(int n) { //책 번호 출력
        String name = books.get(n).BookName();
        System.out.println(name);
        int number = books.indexOf(name);
        return number;
    }

    String getName(int number) { //책 이름 출력
        return books.get(number).BookName();
    }

    String getStatus(int number) { //책 대여 상태 출력
        return books.get(number).status();
    }

    boolean getBorrow(int number) { // 책 대여시
        int renumber = number - 1;
        return books.get(renumber).BookBorrow();
    }
}
