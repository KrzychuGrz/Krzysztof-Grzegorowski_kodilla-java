package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();
            public Forum() {
        forumUserList.add(new ForumUser("0001", "Marik1234", 'm', LocalDate.of(1990,02,12) , 2137));
        forumUserList.add(new ForumUser("0221", "Princess Kitana", 'f', LocalDate.of(1989,9,9), 0));
        forumUserList.add(new ForumUser("9999", "Johnny Silverhand", 'm', LocalDate.of(1990, 06, 28), 12));
        forumUserList.add(new ForumUser("0002", "Delicja Szampańska", 'f', LocalDate.of(1995,06,20), 25));
        forumUserList.add(new ForumUser("2330", "PzkpWTiger", 'm', LocalDate.of(1944,05,20),122));
            }

        public List<ForumUser> getList() {
            return new ArrayList<>(forumUserList);
                }
}
