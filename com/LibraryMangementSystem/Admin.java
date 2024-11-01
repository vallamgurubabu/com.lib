package com.LibraryMangementSystem;
class Admin {
    private Library library;

    public Admin(Library library) {
        this.library = library;
    }
    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author);
        library.addBook(book);
    }
}
