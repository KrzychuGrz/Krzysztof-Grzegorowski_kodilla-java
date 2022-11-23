package com.kodilla.good.patterns.challenges.shop;

public class BuyingDto {

    private User user;
    private boolean isPaid;

    public BuyingDto(User user, boolean isPaid) {
        this.user = user;
        this.isPaid = isPaid;
    }

    public User getUser() {
        return user;
    }
    public boolean isPaid() {
        return isPaid;
    }
}
