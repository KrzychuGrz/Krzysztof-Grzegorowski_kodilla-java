package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User geralt = new Millenials("Geralt of Rivia");
        User shani = new YGeneration("Shani");
        User ciri = new ZGeneration("Cirilla Fiona Elen Riannon");

        //when
        String geraltShouldPost = geralt.sharePost();
        System.out.println("Geralt should" +geraltShouldPost);
        String shaniShouldPost = shani.sharePost();
        System.out.println("Shani should" +shaniShouldPost);
        String ciriShouldPost = ciri.sharePost();
        System.out.println("Ciri should" +ciriShouldPost);

        //then
        assertEquals("Post on Facebook", geraltShouldPost);
        assertEquals("Post on Twitter", shaniShouldPost);
        assertEquals("Post on Snapchat", ciriShouldPost);

    }

    @Test
    void testIndividualSharingStrategies() {
        //given
        User geralt = new Millenials("Geralt of Rivia");

        //
        String geraltShouldPost = geralt.sharePost();
        System.out.println("Geralt should " +geraltShouldPost);
        geralt.setSocialPublisher(new TwitterPublisher());
        geraltShouldPost = geralt.sharePost();
        System.out.println("Geralt should now " +geraltShouldPost);

        //then
        assertEquals("Post on Twitter ", geraltShouldPost);
    }
}
