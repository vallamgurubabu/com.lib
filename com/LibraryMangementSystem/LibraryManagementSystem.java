package com.LibraryMangementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin(library);
        Student student = new Student("John Doe");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Admin - Add Book");
            System.out.println("2. Student - Issue Book");
            System.out.println("3. Student - Return Book");
            System.out.println("4. Student - Display Issued Books");
            System.out.println("5. Library - Display All Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    admin.addBook(id, title, author);
                    break;
                case 2:
                    System.out.print("Enter book ID to issue: ");
                    int issueId = scanner.nextInt();
                    student.issueBook(library, issueId);
                    break;
                case 3:
                    System.out.print("Enter book ID to return: ");
                    int returnId = scanner.nextInt();
                    student.returnBook(library, returnId);
                    break;
                case 4:
                    student.displayIssuedBooks();
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
