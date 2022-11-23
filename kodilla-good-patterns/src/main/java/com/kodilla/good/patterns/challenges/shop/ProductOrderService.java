package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {

    private InfoService infoService;
    private BuyingService buyingService;
    private BuyingRepository buyingRepository;

    public ProductOrderService(InfoService infoService, BuyingService buyingService, BuyingRepository buyingRepository) {
        this.infoService = infoService;
        this.buyingService = buyingService;
        this.buyingRepository = buyingRepository;
    }

    public BuyingDto process (final BuyRequest buyRequest) {
        boolean isOrdered = buyingService.buy(buyRequest.getUser(),buyRequest.getPaymentDay());
        if (isOrdered) {
            infoService.inform(buyRequest.getUser());
            buyingRepository.createOrder(buyRequest.getUser(), buyRequest.getPaymentDay());
            return new BuyingDto(buyRequest.getUser(), true);
        } else {
            return new BuyingDto(buyRequest.getUser(), false);
        }
    }
}
