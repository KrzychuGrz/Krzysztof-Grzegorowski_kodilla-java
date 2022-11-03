package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {

    private final List<List<Country>> wholeWorld = new ArrayList<>();

    public World() {
        wholeWorld.add(Continent.europe);
        wholeWorld.add(Continent.asia);
        wholeWorld.add(Continent.nAmerica);
        wholeWorld.add(Continent.australia);
        wholeWorld.add(Continent.sAmerica);
        wholeWorld.add(Continent.africa);

    }

    public List<List<Country>> getWholeWorld() {
        return wholeWorld;
    }

    public BigDecimal getPeopleQuantity() {
        return wholeWorld.stream()
                .flatMap(wholeWorld -> wholeWorld.stream())
                        .map(Country::getPeopleQuantity)
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
