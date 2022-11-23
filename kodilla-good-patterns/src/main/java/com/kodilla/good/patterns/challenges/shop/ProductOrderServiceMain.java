package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ProductOrderServiceMain {

    public static void main(String[] args) {

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new InfoService() {
                    @Override
                    public String inform(User user) {
                        return null;
                    }
                }, new BuyingService() {
            @Override
            public boolean buy(User user, LocalDateTime paymentDay) {
                return true;
            }
        }, new BuyingRepository() {
            @Override
            public String createOrder(User user, LocalDateTime paymentDay) {
                return null;
            }
        });

        productOrderService.process(buyRequest);




    }
}
