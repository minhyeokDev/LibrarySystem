package bookpackage;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(Arrays.asList(
            new Book("클린코드(Clean Code)"),
            new Book("객체지향의 사실과 오해"),
            new Book("테스트 주도 개발(TDD)")
        ));
        for (; ; ) {
            System.out.println("대여할 책의 번호를 입력하세요.");
            System.out.println("1. 클린코드(Clean code) - " + books.get(0).status());
            System.out.println("2. 객체지향의 사실과 오해 - " + books.get(1).status());
            System.out.println("3. 테스트 주도 개발(TDD) - " + books.get(2).status());
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (num == 1) {
                books.get(0).BooksLend(num);
            } else if (num == 2) {
                books.get(1).BooksLend(num);
            } else if (num == 3) {
                books.get(2).BooksLend(num);
            }
        }
    }
}
