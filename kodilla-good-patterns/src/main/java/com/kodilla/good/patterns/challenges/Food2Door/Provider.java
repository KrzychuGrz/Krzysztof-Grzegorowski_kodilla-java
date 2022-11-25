package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Provider {

    private String name;
    private String assortment;
    private String email;

    public Provider(String name, String assortment, String email) {
        this.name = name;
        this.assortment = assortment;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAssortment() {
        return assortment;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provider provider = (Provider) o;

        if (!Objects.equals(name, provider.name)) return false;
        if (!Objects.equals(assortment, provider.assortment)) return false;
        return Objects.equals(email, provider.email);
    }
}
