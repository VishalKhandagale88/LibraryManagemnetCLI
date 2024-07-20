package action;

import domain.Book;
import domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library implements LibraryActions{
    private List<Book> books;
    private Map<Integer, Member> member;
    private Map<String,Book> issuedBook;

    public Library() {
       books = new ArrayList<>();
       member = new HashMap<>();
       issuedBook = new HashMap<>();
    }


    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("book added "+book.getTitle());
    }

    @Override
    public void addMember() {

    }

    @Override
    public void issueBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void listAllBooks() {
        System.out.println("Listing all books");
        for (Book book : books){
            System.out.println("Book title  : "+book.getTitle());
        }
    }

    @Override
    public void listAllMembers() {

    }

    @Override
    public void searchBookByTitle() {

    }

    @Override
    public void sorBooks() {

    }

    @Override
    public void sortMember() {

    }
}
