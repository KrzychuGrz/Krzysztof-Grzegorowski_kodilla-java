package com.kodilla.patterns.builder.BigMac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> toppings = new ArrayList<>();

    public static class BigMacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> toppings = new ArrayList<>();

        public BigMacBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder setToppings(String topping) {
            toppings.add(topping);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, toppings);
        }
    }


        public BigMac(final String bun, final int burgers, final String sauce, List<String> toppings) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.toppings = new ArrayList<>(toppings);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
