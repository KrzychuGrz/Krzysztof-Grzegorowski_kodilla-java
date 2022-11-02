package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    static Country poland = new Country("Poland", new BigDecimal("40000000"));
    static Country china = new Country("China", new BigDecimal("1400000000"));
    static Country canada = new Country("Canada", new BigDecimal("38000000"));
    static Country australia = new Country("Australia", new BigDecimal("21000000"));
    static Country argentina = new Country("Argentina", new BigDecimal("46000000"));
    static Country rsa = new Country("Republic of South Africa", new BigDecimal("60000000"));

}
