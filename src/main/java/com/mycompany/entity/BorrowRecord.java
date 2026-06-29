package com.mycompany.entity;

/**
 * Entity class representing a BorrowRecord in the library management system.
 * Tracks each borrowing transaction between a member and a book.
 * 
 * Business Rules Supported:
 * - BR3: Records member borrowing transactions
 * - BR6: Records borrow date (must be current or in the past); tracks return status
 * - BR7: Calculates overdue fine based on borrow and return dates
 * - BR8: Used to manage stock and member borrow counts
 */
public abstract class BorrowRecord {
    // BR3: Identifies the member borrowing the book
    protected String memberId;
    // BR3: Identifies the book being borrowed
    protected String bookId;
    // BR6: Records the date when the book was borrowed (must be current or in the past)
    protected String borrowDate;
    // BR6: Tracks whether the book has been returned (return date must be after borrow date)
    protected boolean isReturned;

    public BorrowRecord(String memberId, String bookId, String borrowDate) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.isReturned = false;
    }

    // Getters and Setters
    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookId() {
        return this.bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBorrowDate() {
        return this.borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public boolean isReturned() {
        return this.isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
    
    // Abstract method to calculate fine polymorphically
    public abstract long calculateFine(long daysOverdue, Member member);
}
