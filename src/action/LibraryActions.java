package action;

import domain.Book;
import domain.Member;

public interface LibraryActions {
    void addBook(Book book);
    void addMember(Member member);
//    void addEmployee();
    void issueBook();
    void returnBook();
    void listAllBooks();
    void listAllMembers();
//    void listAllEmployee();
    void searchBookByTitle();
    void sorBooks();
    void sortMember();
}
