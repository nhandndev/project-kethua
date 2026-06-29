package com.mycompany.entity;

public class PhysicalBorrowRecord extends BorrowRecord {
    private String conditionOut;
    private String conditionIn;

    public PhysicalBorrowRecord(String memberId, String bookId, String borrowDate) {
        super(memberId, bookId, borrowDate);
        this.conditionOut = "Good";
        this.conditionIn = "";
    }

    public String getConditionOut() {
        return conditionOut;
    }

    public void setConditionOut(String conditionOut) {
        this.conditionOut = conditionOut;
    }

    public String getConditionIn() {
        return conditionIn;
    }

    public void setConditionIn(String conditionIn) {
        this.conditionIn = conditionIn;
    }

    @Override
    public long calculateFine(long daysOverdue, Member member) {
        return member.calculateFine(daysOverdue);
    }
}
