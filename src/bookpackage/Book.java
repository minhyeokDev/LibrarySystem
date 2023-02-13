package bookpackage;

public class Book {

    int number;
    boolean canLend; //대여 중인지 아닌지

    Book(int num , boolean canLend) {
        this.number = num;
        this.canLend = canLend;
    }

    boolean BooksLend(int number) // 책 대여 시스템
    {
        //if(this.number == number) {
        if (this.canLend == true) {
            System.out.println("정상적으로 대여가 완료되었습니다.");
            return this.canLend = false; //대여 완료 후 책 대여 불가 상태로 return
        } else if (this.canLend == false) {
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
            return this.canLend = false; //반납 시스템은 없으므로 false 하고 끝
        } else { //번호 잘못 입력할때
            System.out.println("존재하지 않는 도서 입니다.");
            return false;
        }
    }

    String status() { //대여 상태 확인
        if (this.canLend == true) {
            return "대여 가능";
        } else {
            return "대여 중";
        }
    }
}
