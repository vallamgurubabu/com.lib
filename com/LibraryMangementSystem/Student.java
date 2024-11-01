package com.LibraryMangementSystem;

import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Book> issuedBooks;

    public Student(String name) {
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Library library, int bookId) {
        Book book = library.getBookById(bookId);
        if (book != null && !book.isIssued()) {
            book.issue();
            issuedBooks.add(book);
            System.out.println("Book issued: " + book.getTitle());
        } else {
            System.out.println("Book is already issued or does not exist.");
        }
    }

    public void returnBook(Library library, int bookId) {
        Book book = library.getBookById(bookId);
        if (book != null && issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("This book was not issued to you.");
        }
    }

    public void displayIssuedBooks() {
        System.out.println("Books issued to " + name + ":");
        for (Book book : issuedBooks) {
            System.out.println(book);
        }
    }
}
