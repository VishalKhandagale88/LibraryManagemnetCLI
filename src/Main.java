import action.Library;
import domain.Book;

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
                case 5:
                    library.listAllBooks();
                    break;
            }

        }while (choice != 10);
    }
}