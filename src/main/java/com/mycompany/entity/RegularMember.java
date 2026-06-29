package com.mycompany.entity;

public class RegularMember extends Member {

    public RegularMember(String id, String name, String phone, String email) {
        super(id, name, phone, email);
    }

    @Override
    public int getBorrowLimit() {
        return 3;
    }

    @Override
    public long calculateFine(long daysOverdue) {
        return daysOverdue * 5000;
    }

    @Override
    public int getBorrowPeriod() {
        return 7;
    }

    @Override
    public String getType() {
        return "regular";
    }
}
