package com.mycompany.entity;

public class Ebook extends Book {
    private double fileSize;
    private String format;

    public Ebook(String id, String title, String author, String genre, int year, double fileSize, String format) {
        // Ebooks have unlimited quantity, so we can pass a special value like 999 or simply ignore it in override
        super(id, title, author, genre, year, 999);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void decreaseQuantity() {
        // Ebooks don't decrease in stock
    }

    @Override
    public String getType() {
        return "ebook";
    }
}
