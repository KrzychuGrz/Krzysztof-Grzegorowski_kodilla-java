package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public interface BuyingService {

    boolean buy(User user, LocalDateTime paymentDay);
}
