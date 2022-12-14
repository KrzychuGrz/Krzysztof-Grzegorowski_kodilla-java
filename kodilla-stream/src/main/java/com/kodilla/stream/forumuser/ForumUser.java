package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final String userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;


    public ForumUser(String userID, String userName, char sex, LocalDate birthDate, int posts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return LocalDate.of(0000,00,00);
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
