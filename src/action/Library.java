package action;

import domain.Book;
import domain.Member;

import java.util.*;

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
    public void addMember(Member libMember) {
        member.put(libMember.getMemberId(),libMember);
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
        System.out.println("All members -");
        for (Member member1 : member.values()){
            System.out.println("Name -- "+member1.getName());
        }
    }

    @Override
    public void searchBookByTitle(String title) {
        for(Book book : books){
            // hr -- hR
            if(book.getTitle().equalsIgnoreCase(title)){
                book.display();
                return;
            }
        }
        System.out.println("Book not found");
    }

    @Override
    public void sorBooks() {
      Collections.sort(books);
    }

    @Override
    public void sortMember() {
        List<Member> memberList = new ArrayList<>();
        memberList.sort(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Member sorted");
        for(Member member1 : memberList){
            member1.display();
        }
    }
}
