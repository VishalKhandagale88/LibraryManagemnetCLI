package action;

import domain.Book;
import domain.Member;

import java.util.*;

public class Library implements LibraryActions {
    private final List<Book> books;
    private final Map<Integer, Member> member;
    private final Map<String, Book> issuedBook;

    public Library() {
        books = new ArrayList<>();
        member = new HashMap<>();
        issuedBook = new HashMap<>();
    }


    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("book added " + book.getTitle());
    }

    @Override
    public void addMember(Member libMember) {
        member.put(libMember.getMemberId(), libMember);
    }

    @Override
    public void issueBook(int memberId, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                Member member1 = member.get(memberId);
                if (member1 != null) {
                    book.setIssued(true);
                    issuedBook.put(title, book);
                    System.out.println("book issued : "+title + "to "+ member1.getName() );
                    return;
                }
                    System.out.println("Member does not exists");
                    return;
            }
        }
        System.out.println("Book not found or already issued");
    }

    @Override
    public void returnBook(String title) {
        Book removeBook = issuedBook.remove(title);
        if (removeBook != null) {
            removeBook.setIssued(false);
            System.out.println("Book returned");
        } else {
            System.out.println("Book not found");
        }
    }

    @Override
    public void listAllBooks() {
        System.out.println("Listing all books");
        for (Book book : books) {
            System.out.println("Book title  : " + book.getTitle());
        }
    }

    @Override
    public void listAllMembers() {
        System.out.println("All members -");
        for (Member member1 : member.values()) {
            System.out.println("Name -- " + member1.getName());
        }
    }

    @Override
    public void searchBookByTitle(String title) {
        for (Book book : books) {
            // hr -- hR
            if (book.getTitle().equalsIgnoreCase(title)) {
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
        List<Member> memberList = new ArrayList<>(member.values());
        memberList.sort(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Member sorted");
        for (Member member1 : memberList) {
            member1.display();
        }
    }
}
