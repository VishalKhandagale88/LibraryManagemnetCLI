package action;

import domain.Book;
import domain.Member;

public interface LibraryActions {
    void addBook(Book book);
    void addMember(Member member);
//    void addEmployee();
    void issueBook(int memberId,String title);
    void returnBook();
    void listAllBooks();
    void listAllMembers();
//    void listAllEmployee();
    void searchBookByTitle(String title);
    void sorBooks();
    void sortMember();
}
