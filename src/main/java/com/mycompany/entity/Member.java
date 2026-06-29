package com.mycompany.entity;

/**
 * Entity class representing a Member in the library management system.
 * 
 * Business Rules Supported:
 * - BR1: Each Member ID must be unique and cannot be modified
 * - BR3: A member must exist before borrowing a book
 * - BR5: A member cannot exceed their borrowing limit (varies by member type)
 * - BR7: Fine calculation varies by member type
 * - BR8: Member's borrow counts are updated when borrowing or returning books
 */
public abstract class Member {
    // BR1: Each Member ID must be unique and cannot be modified
    private String id;
    private String name;
    private String phone;
    private String email;
    // BR5: Track current borrow count to enforce borrowing limit
    private int currentBorrowCount;
    // BR8: Track total borrow count for reporting purposes
    private int totalBorrowCount;

    public Member(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.currentBorrowCount = 0;
        this.totalBorrowCount = 0;
    }

    // Getters and Setters

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCurrentBorrowCount() {
        return this.currentBorrowCount;
    }

    public void setCurrentBorrowCount(int currentBorrowCount) {
        this.currentBorrowCount = currentBorrowCount;
    }

    public int getTotalBorrowCount() {
        return this.totalBorrowCount;
    }

    public void setTotalBorrowCount(int totalBorrowCount) {
        this.totalBorrowCount = totalBorrowCount;
    }

    // Entity logic
    /**
     * BR5: Increments current borrow count when a book is borrowed.
     */
    public void incrementCurrentBorrowCount() {
        this.currentBorrowCount++;
    }

    /**
     * BR5: Decrements current borrow count when a borrowed book is returned.
     */
    public void decrementCurrentBorrowCount() {
        if (this.currentBorrowCount > 0) {
            this.currentBorrowCount--;
        }
    }

    /**
     * BR8: Increments total borrow count for historical tracking.
     */
    public void incrementTotalBorrowCount() {
        this.totalBorrowCount++;
    }

    // Abstract methods to enforce polymorphic behavior based on member type
    public abstract int getBorrowLimit();
    public abstract long calculateFine(long daysOverdue);
    public abstract int getBorrowPeriod();
    public abstract String getType();
}
