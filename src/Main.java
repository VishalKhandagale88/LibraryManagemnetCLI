import action.Library;
import domain.Book;
import domain.Member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner  = new Scanner(System.in);
        int choice;
        do{
            System.out.println("#Welcome to Ahmed's library management system ");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. List All Books");
            System.out.println("6. List All members");
            System.out.println("7. Search Book by title");
            System.out.println("8. Sort Books");
            System.out.println("9. Sort Member");
            System.out.println("10. Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Adding Book......");
                    System.out.println("Enter book title");
                    String title = scanner.next();

                    System.out.println("Enter book author");
                    String author = scanner.next();

                    System.out.println("Enter book genre");
                    String genre = scanner.next();
                    library.addBook(new Book(title,author,genre));
                    break;
                case 2 :
                    System.out.println("Adding a member ");
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter member Id : ");
                    int memberId = scanner.nextInt();
                    library.addMember( new Member(name,memberId));
                    break;
                case 3:
                    System.out.println("Enter member id");
                    int memId = scanner.nextInt();
                    System.out.println("Book title to be issued");
                    String memName = scanner.next();
                    library.issueBook(memId,memName);
                    break;
                case 4:
                    System.out.println("Enter book title to return");
                    String returnBookTitle = scanner.next();
                    library.returnBook(returnBookTitle);
                    break;
                case 5:
                    library.listAllBooks();
                    break;
                case 6:
                    library.listAllMembers();
                    break;
                case 7:
                    System.out.println("Enter book title");
                    String bookTitle = scanner.next();
                    library.searchBookByTitle(bookTitle);
                case 8:
                    library.sorBooks();
                    break;
                case 9:
                    library.sortMember();
                    break;
            }

        }while (choice != 10);
    }
}