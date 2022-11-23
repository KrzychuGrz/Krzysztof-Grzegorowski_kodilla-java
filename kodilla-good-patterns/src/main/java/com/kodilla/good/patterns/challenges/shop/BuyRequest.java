package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class BuyRequest {

    private User user;
    private LocalDateTime paymentDay;

    public BuyRequest(User user, LocalDateTime paymentDay) {
        this.user = user;
        this.paymentDay = paymentDay;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getPaymentDay() {
        return paymentDay;
    }
}
