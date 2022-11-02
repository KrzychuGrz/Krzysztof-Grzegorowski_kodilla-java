package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public final List<Country> europe = new ArrayList<>();
    public final List<Country> asia = new ArrayList<>();
    public final List<Country> nAmerica = new ArrayList<>();
    public final List<Country> australia = new ArrayList<>();
    public final List<Country> sAmerica = new ArrayList<>();
    public final List<Country> africa = new ArrayList<>();

    public Continent() {
        europe.add(Country.poland);
        asia.add(Country.china);
        nAmerica.add(Country.canada);
        australia.add(Country.australia);
        sAmerica.add(Country.argentina);
        africa.add(Country.rsa);

    }

}
