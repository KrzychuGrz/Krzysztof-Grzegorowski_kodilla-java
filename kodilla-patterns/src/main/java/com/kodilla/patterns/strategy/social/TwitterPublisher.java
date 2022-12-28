package com.kodilla.patterns.strategy.social;

public non-sealed class TwitterPublisher implements SocialPublisher {

    public String share() {
        return "Post on Twitter";
    }


}
