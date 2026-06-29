package com.mycompany.entity;

public class PhysicalBook extends Book {
    private double weight;
    private String shelfLocation;

    public PhysicalBook(String id, String title, String author, String genre, int year, int quantity, double weight, String shelfLocation) {
        super(id, title, author, genre, year, quantity);
        this.weight = weight;
        this.shelfLocation = shelfLocation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    @Override
    public String getType() {
        return "physical";
    }
}
