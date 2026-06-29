package com.mycompany.entity;

/**
 * Entity class representing a Book in the library management system.
 * 
 * Business Rules Supported:
 * - BR1: Each Book ID must be unique and cannot be modified
 * - BR2: Book title, author, and genre must not be empty
 * - BR8: Book stock is reduced upon borrowing and increased upon returning
 * - BR10: Popular books are determined by the total number of times they have been borrowed
 */
public abstract class Book {
    // BR1: Each Book ID must be unique and cannot be modified
    private String id;
    // BR2: Book title, author, and genre must not be empty
    private String title;
    private String author;
    private String genre;
    private int year;
    // BR8: Book stock is reduced upon borrowing and increased upon returning
    private int quantity;
    // BR10: Track the total number of times a book has been borrowed to determine popularity
    private int borrowCount;

    public Book(String id, String title, String author, String genre, int year, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.quantity = quantity;
        this.borrowCount = 0;
    }

    // Getters and Setters
    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBorrowCount() {
        return this.borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    // Entity logic
    /**
     * BR8: Increases book quantity when a borrowed book is returned.
     */
    public void increaseQuantity() {
        this.quantity++;
    }

    /**
     * BR8: Decreases book quantity when a book is borrowed.
     * BR4: Ensures quantity does not go below 0.
     */
    public void decreaseQuantity() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }

    /**
     * BR10: Increments borrow count to track popularity of the book.
     */
    public void incrementBorrowCount() {
        this.borrowCount++;
    }

    // Abstract methods to enforce polymorphic behavior
    public abstract String getType();
}
