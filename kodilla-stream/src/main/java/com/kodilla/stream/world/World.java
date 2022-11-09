//package com.kodilla.stream.world;
//
//import java.math.BigDecimal;
//import java.util.HashSet;
//import java.util.Set;
//
//
//public final class World {
//
//    public final Set<Continent> earth = new HashSet<>();
//
//    public Set<Continent> getEarth() {
//        return earth;
//    }
//
//    public void addContinent(Continent continent) {
//    }
//
//
//    public BigDecimal getPeopleQuantity() {
//        return earth.stream()
//                .flatMap(earth -> earth.getEarth().stream())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current)));
//    }
//}
