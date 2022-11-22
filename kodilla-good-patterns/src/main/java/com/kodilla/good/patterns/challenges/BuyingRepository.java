package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface BuyingRepository {

    String createOrder(User user, LocalDateTime paymentDay);

}
