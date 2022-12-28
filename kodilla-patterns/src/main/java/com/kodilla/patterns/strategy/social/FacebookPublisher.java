package com.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {

    public String share() {
        return "Post on Facebook";
    }
}
