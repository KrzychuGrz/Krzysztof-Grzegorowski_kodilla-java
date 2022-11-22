package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {

    private String name;
    private String lastName;
    private String accountName;

    private String email;

    public User(String name, String lastName, String accountName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.accountName = accountName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(lastName, user.lastName)) return false;
        if (!Objects.equals(accountName, user.accountName)) return false;
        return Objects.equals(email, user.email);
    }

}
