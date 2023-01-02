package com.kodilla.patterns.builder.BigMac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void TestBigMacNew() {
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .setBun("non-sesame")
                .setBurgers(2)
                .setSauce("hot chilli")
                .setToppings("bacon")
                .setToppings("cheese")
                .setToppings("onion")
                .build();
        System.out.println(bigMac);

        //when
        int howManyIngredients = bigMac.getToppings().size();

        //then
        assertEquals(3, howManyIngredients);




    }
}
