//package com.kodilla.stream.world;
//
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class WorldTestSuite {
//
//    @Test
//    void testGetPeopleQuantity() {
//
//        //Given
//
//         Country poland = new Country("Poland", new BigDecimal("40000000"));
//         Country china = new Country("China", new BigDecimal("1400000000"));
//         Country canada = new Country("Canada", new BigDecimal("38000000"));
//         Country australia = new Country("Australia", new BigDecimal("21000000"));
//         Country argentina = new Country("Argentina", new BigDecimal("46000000"));
//         Country rsa = new Country("Republic of South Africa", new BigDecimal("60000000"));
//
//         Continent europe = new Continent();
//         europe.addCountry(poland);
//         Continent asia = new Continent();
//         asia.addCountry(china);
//         Continent nAmerica = new Continent();
//         nAmerica.addCountry(canada);
//         Continent continentAustralia = new Continent();
//         continentAustralia.addCountry(australia);
//         Continent sAmerica = new Continent();
//         sAmerica.addCountry(argentina);
//         Continent africa = new Continent();
//         africa.addCountry(rsa);
//
//         World wholeWorld = new World();
//         wholeWorld.addContinent(europe);
//         wholeWorld.addContinent(asia);
//         wholeWorld.addContinent(nAmerica);
//         wholeWorld.addContinent(continentAustralia);
//         wholeWorld.addContinent(sAmerica);
//         wholeWorld.addContinent(africa);
//
//
//            //when
//      BigDecimal allThePeople = wholeWorld.stream()
//
//
//            //then
//          BigDecimal result = new BigDecimal("1605000000");
//        assertEquals(result, allThePeople);
//    }
//
//}
