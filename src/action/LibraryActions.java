package action;

import domain.Book;

public interface LibraryActions {
    void addBook(Book book);
    void addMember();
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
