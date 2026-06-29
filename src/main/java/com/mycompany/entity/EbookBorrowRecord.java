package com.mycompany.entity;

public class EbookBorrowRecord extends BorrowRecord {
    private String downloadLink;

    public EbookBorrowRecord(String memberId, String bookId, String borrowDate, String downloadLink) {
        super(memberId, bookId, borrowDate);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public long calculateFine(long daysOverdue, Member member) {
        // Ebooks are automatically revoked, so there is never an overdue fine
        return 0;
    }
}
