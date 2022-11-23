package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class BuyRequestRetriever {

    public BuyRequest retrieve() {
        User user = new User("Zoltan", "Chivay", "pikeIsLordOfPontar", "zoltanthedwarf@nv.com");

        LocalDateTime paymentDay = LocalDateTime.of(2022, 11, 23, 12, 22);

        return new BuyRequest(user, paymentDay);

    }
}
