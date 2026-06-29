package com.mycompany.entity;

public class PremiumMember extends Member {

    public PremiumMember(String id, String name, String phone, String email) {
        super(id, name, phone, email);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    @Override
    public long calculateFine(long daysOverdue) {
        return daysOverdue * 2500;
    }

    @Override
    public int getBorrowPeriod() {
        return 14;
    }

    @Override
    public String getType() {
        return "premium";
    }
}
