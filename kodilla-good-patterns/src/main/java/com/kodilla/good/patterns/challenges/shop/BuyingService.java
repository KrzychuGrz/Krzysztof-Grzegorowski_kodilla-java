package com.kodilla.good.patterns.challenges.shop;


import java.time.LocalDateTime;

public interface BuyingService {

    boolean buy(User user, LocalDateTime paymentDay);
}
